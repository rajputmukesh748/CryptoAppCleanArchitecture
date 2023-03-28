package com.cleanArchitecture.cryptoApp.domain.model

import com.cleanArchitecture.cryptoApp.data.remote.dto.CoinDetailDto

data class CoinDetail(
    val coinId: String? = null,
    val name: String? = null,
    val description: String? = null,
    val symbol: String? = null,
    val rank: Int? = null,
    val isActive: Boolean? = null,
    val tags: List<String>? = null,
    val team: List<CoinDetailDto.TeamDC>? = null,
)
