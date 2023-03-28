package com.cleanArchitecture.cryptoApp.data.remote.dto

import androidx.annotation.Keep
import com.cleanArchitecture.cryptoApp.domain.model.Coin
import com.google.gson.annotations.SerializedName

@Keep
data class CoinDto(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("is_active")
    val isActive: Boolean? = null,
    @SerializedName("is_new")
    val isNew: Boolean? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("rank")
    val rank: Int? = null,
    @SerializedName("symbol")
    val symbol: String? = null,
    @SerializedName("type")
    val type: String? = null
)


fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}