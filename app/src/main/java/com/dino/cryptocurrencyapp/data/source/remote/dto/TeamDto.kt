package com.dino.cryptocurrencyapp.data.source.remote.dto


import com.google.gson.annotations.SerializedName

data class TeamDto(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("position")
    val position: String
)