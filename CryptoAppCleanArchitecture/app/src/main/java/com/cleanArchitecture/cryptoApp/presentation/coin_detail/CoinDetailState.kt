package com.cleanArchitecture.cryptoApp.presentation.coin_detail

import com.cleanArchitecture.cryptoApp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
