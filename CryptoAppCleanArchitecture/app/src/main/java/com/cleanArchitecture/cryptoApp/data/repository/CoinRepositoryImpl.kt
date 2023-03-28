package com.cleanArchitecture.cryptoApp.data.repository

import com.cleanArchitecture.cryptoApp.data.remote.CoinPaprikaApi
import com.cleanArchitecture.cryptoApp.data.remote.dto.CoinDetailDto
import com.cleanArchitecture.cryptoApp.data.remote.dto.CoinDto
import com.cleanArchitecture.cryptoApp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId = coinId)
    }
}