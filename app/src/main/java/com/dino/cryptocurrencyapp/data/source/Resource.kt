package com.dino.cryptocurrencyapp.data.source

sealed class Resource<out T> {
    data class Success<T>(val value:T): Resource<T>()
    data class Error(
        val isNetworkError: Boolean,
        val errorCode: Int?,
        val errorBody: String?
    ): Resource<Nothing>()

    object Loading: Resource<Nothing>()
    object Empty: Resource<Nothing>()
}