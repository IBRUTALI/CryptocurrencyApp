package com.ighorosipov.cryptocurrencyapp.domain.use_case.get_coins

import com.ighorosipov.cryptocurrencyapp.domain.model.Coin
import com.ighorosipov.cryptocurrencyapp.domain.repository.CoinRepository
import com.ighorosipov.cryptocurrencyapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {

    operator fun invoke(): Flow<Resource<List<Coin>>> {
        return flow {
            emit(repository.getCoins())
        }
    }

}