package com.dino.cryptocurrencyapp.data.source.remote.network

import com.dino.cryptocurrencyapp.data.source.Resource
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import java.io.IOException

interface SafeApiCall {
    suspend fun <T> safeApiCall(
        apiCall: suspend () -> T
    ): Resource<T> {
        return withContext(Dispatchers.IO) {
            try {
                Resource.Success(apiCall.invoke())
            } catch (throwable: Throwable) {
                when (throwable) {
                    is HttpException -> {
                        Resource.Error(false, throwable.code(), throwable.localizedMessage ?: "An unexpected error occurred")
                    }
                    is IOException -> {
                        Resource.Error(false, 400, "Couldn't reach server. Check your internet connection")
                    }
                    else -> {
                        Resource.Error(true, null, null)
                    }
                }
            }
        }
    }
}