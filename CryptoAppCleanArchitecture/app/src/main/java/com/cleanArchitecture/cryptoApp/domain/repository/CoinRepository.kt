package com.cleanArchitecture.cryptoApp.domain.repository

import com.cleanArchitecture.cryptoApp.data.remote.dto.CoinDetailDto
import com.cleanArchitecture.cryptoApp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto

}