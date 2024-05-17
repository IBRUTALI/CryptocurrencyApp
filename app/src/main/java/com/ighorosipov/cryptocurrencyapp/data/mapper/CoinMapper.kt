package com.ighorosipov.cryptocurrencyapp.data.mapper

import com.ighorosipov.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.ighorosipov.cryptocurrencyapp.data.remote.dto.CoinDto
import com.ighorosipov.cryptocurrencyapp.domain.model.Coin
import com.ighorosipov.cryptocurrencyapp.domain.model.CoinDetail

class CoinMapper {

    fun coinDtoToCoin(coinDto: CoinDto) : Coin {
        return Coin(
            id = coinDto.id,
            isActive = coinDto.isActive,
            name = coinDto.name,
            rank = coinDto.rank,
            symbol = coinDto.symbol
        )
    }

    fun coinDetailDtoToCoinDetail(coinDetailDto: CoinDetailDto): CoinDetail {
        return CoinDetail(
            coinId = coinDetailDto.id,
            name = coinDetailDto.name,
            description = coinDetailDto.description,
            symbol = coinDetailDto.symbol,
            rank = coinDetailDto.rank,
            isActive = coinDetailDto.isActive,
            tags = coinDetailDto.tags.map { it.name },
            team = coinDetailDto.team
        )
    }

}