package com.dino.cryptocurrencyapp.domain.model

data class CoinDetail(
    val id: String,
    val name: String,
    val symbol: String,
    val rank: Int,
    val isNew: Boolean,
    val isActive: Boolean,
    val type: String,
    val tags: List<String>,
    val team: List<String>,
    val description: String
)