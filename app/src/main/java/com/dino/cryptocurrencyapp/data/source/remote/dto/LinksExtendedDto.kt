package com.dino.cryptocurrencyapp.data.source.remote.dto


import com.google.gson.annotations.SerializedName

data class LinksExtendedDto(
    @SerializedName("url")
    val url: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("stats")
    val stats: StatsDto
)