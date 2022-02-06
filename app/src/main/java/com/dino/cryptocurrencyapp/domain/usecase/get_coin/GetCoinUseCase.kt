package com.dino.cryptocurrencyapp.domain.usecase.get_coin

import com.dino.cryptocurrencyapp.common.mapper.toCoinDetail
import com.dino.cryptocurrencyapp.data.source.Resource
import com.dino.cryptocurrencyapp.data.source.remote.network.SafeApiCall
import com.dino.cryptocurrencyapp.domain.model.CoinDetail
import com.dino.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
): SafeApiCall {

    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        emit( Resource.Loading )
        emit( safeApiCall { repository.getCoinsDetail(coinId).toCoinDetail() } )
    }.flowOn(Dispatchers.IO)
}