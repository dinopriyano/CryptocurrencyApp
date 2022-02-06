package com.dino.cryptocurrencyapp.common.mapper

import com.dino.cryptocurrencyapp.data.source.remote.dto.CoinDetailDto
import com.dino.cryptocurrencyapp.domain.model.CoinDetail

fun CoinDetailDto.toCoinDetail(): CoinDetail {
    return CoinDetail(
        id = id,
        name = name,
        symbol = symbol,
        rank = rank,
        isNew = isNew,
        isActive = isActive,
        type = type,
        tags = tags.map { it.name },
        team = team.map { it.name },
        description = description
    )
}