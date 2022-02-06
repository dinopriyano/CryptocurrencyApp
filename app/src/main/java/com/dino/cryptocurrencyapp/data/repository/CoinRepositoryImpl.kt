package com.dino.cryptocurrencyapp.data.repository

import com.dino.cryptocurrencyapp.data.source.remote.dto.CoinDetailDto
import com.dino.cryptocurrencyapp.data.source.remote.dto.CoinDto
import com.dino.cryptocurrencyapp.data.source.remote.network.ApiService
import com.dino.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val apiService: ApiService
): CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return apiService.getCoins()
    }

    override suspend fun getCoinsDetail(coinId: String): CoinDetailDto {
        return apiService.getCoinDetail(coinId)
    }


}