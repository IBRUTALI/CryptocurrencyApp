package com.ighorosipov.cryptocurrencyapp.domain.use_case.get_coins

import com.ighorosipov.cryptocurrencyapp.domain.model.Coin
import com.ighorosipov.cryptocurrencyapp.domain.model.CoinDetail
import com.ighorosipov.cryptocurrencyapp.domain.repository.CoinRepository
import com.ighorosipov.cryptocurrencyapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {

    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> {
        return flow {
            emit(Resource.Loading())
            emit(repository.getCoinsById(coinId))
        }
    }

}