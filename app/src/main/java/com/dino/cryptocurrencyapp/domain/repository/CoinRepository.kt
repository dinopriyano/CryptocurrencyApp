package com.dino.cryptocurrencyapp.domain.repository

import com.dino.cryptocurrencyapp.data.source.Resource
import com.dino.cryptocurrencyapp.data.source.remote.dto.CoinDetailDto
import com.dino.cryptocurrencyapp.data.source.remote.dto.CoinDto
import kotlinx.coroutines.flow.Flow

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinsDetail(coinId: String): CoinDetailDto

}