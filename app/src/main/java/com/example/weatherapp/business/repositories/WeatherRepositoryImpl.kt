package com.example.weatherapp.business.repositories

import com.example.weatherapp.business.common.Resource
import com.example.weatherapp.business.datamapper.WeatherDataMapper
import com.example.weatherapp.business.model.WeatherData
import com.example.weatherapp.data.api.WeatherApi
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor (
    private val api : WeatherApi
) : WeatherRepository{

    override suspend fun getWeatherData(q: String): Resource<WeatherData> {
        return try {
            Resource.Success(
                data = WeatherDataMapper.toModel(api.getWeatherData(q).weatherData)
            )
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}