package com.example.weatherapp.di

import com.example.weatherapp.business.repositories.WeatherRepository
import com.example.weatherapp.business.repositories.WeatherRepositoryImpl
import com.example.weatherapp.data.location.LocationTrackerImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ) : WeatherRepository
}