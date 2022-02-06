package com.dino.cryptocurrencyapp.common.mapper

import com.dino.cryptocurrencyapp.data.source.remote.dto.CoinDto
import com.dino.cryptocurrencyapp.domain.model.Coin

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        name = name,
        symbol = symbol,
        rank = rank,
        isNew = isNew,
        isActive = isActive,
        type = type
    )
}