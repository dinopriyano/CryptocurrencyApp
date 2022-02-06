package com.dino.cryptocurrencyapp.domain.usecase.get_coins

import com.dino.cryptocurrencyapp.common.mapper.toCoin
import com.dino.cryptocurrencyapp.data.source.Resource
import com.dino.cryptocurrencyapp.data.source.remote.network.SafeApiCall
import com.dino.cryptocurrencyapp.domain.model.Coin
import com.dino.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
): SafeApiCall {

    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        emit( Resource.Loading )
        emit( safeApiCall { repository.getCoins().map { it.toCoin() } } )
    }.flowOn(Dispatchers.IO)
}