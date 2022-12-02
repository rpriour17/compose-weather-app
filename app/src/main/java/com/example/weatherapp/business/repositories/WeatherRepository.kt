package com.example.weatherapp.business.repositories

import com.example.weatherapp.business.common.Resource
import com.example.weatherapp.business.model.WeatherData
import com.example.weatherapp.business.model.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(latitude: Double, longitude: Double) : Resource<WeatherData>

}