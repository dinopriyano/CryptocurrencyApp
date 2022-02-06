package com.dino.cryptocurrencyapp.data.source.remote.network

import com.dino.cryptocurrencyapp.data.source.remote.dto.CoinDetailDto
import com.dino.cryptocurrencyapp.data.source.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("vi/coins/{coinId}")
    suspend fun getCoinDetail(
        @Path("coinId") coinId: String
    ): CoinDetailDto

}