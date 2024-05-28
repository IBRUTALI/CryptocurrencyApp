package com.ighorosipov.cryptocurrencyapp.presentation.screens.coin_detail

import com.ighorosipov.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)