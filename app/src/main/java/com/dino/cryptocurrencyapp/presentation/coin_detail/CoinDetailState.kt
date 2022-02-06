package com.dino.cryptocurrencyapp.presentation.coin_detail

import com.dino.cryptocurrencyapp.data.source.Resource
import com.dino.cryptocurrencyapp.domain.model.Coin
import com.dino.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState (
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: Resource.Error? = null
)