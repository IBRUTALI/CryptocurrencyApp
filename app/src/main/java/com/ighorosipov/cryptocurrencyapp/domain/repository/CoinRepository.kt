package com.ighorosipov.cryptocurrencyapp.domain.repository

import com.ighorosipov.cryptocurrencyapp.domain.model.Coin
import com.ighorosipov.cryptocurrencyapp.domain.model.CoinDetail
import com.ighorosipov.cryptocurrencyapp.util.Resource

interface CoinRepository {

    suspend fun getCoins(): Resource<List<Coin>>

    suspend fun getCoinsById(coinId: String): Resource<CoinDetail>

}