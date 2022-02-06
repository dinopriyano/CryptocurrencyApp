package com.dino.cryptocurrencyapp.data.source.remote.dto


import com.google.gson.annotations.SerializedName

data class StatsDto(
    @SerializedName("subscribers")
    val subscribers: Int,
    @SerializedName("contributors")
    val contributors: Int,
    @SerializedName("stars")
    val stars: Int,
    @SerializedName("followers")
    val followers: Int
)