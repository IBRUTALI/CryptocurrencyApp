package com.ighorosipov.cryptocurrencyapp.di

import com.ighorosipov.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.ighorosipov.cryptocurrencyapp.data.repository.CoinRepositoryImpl
import com.ighorosipov.cryptocurrencyapp.domain.repository.CoinRepository
import com.ighorosipov.cryptocurrencyapp.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface AppModule {

    companion object {
        @Provides
        @Singleton
        fun providePaprikaApi(): CoinPaprikaApi {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create()
        }

        @Provides
        @Singleton
        fun provideCoinRepository(api: CoinPaprikaApi): CoinRepository {
            return CoinRepositoryImpl(api)
        }
    }

}