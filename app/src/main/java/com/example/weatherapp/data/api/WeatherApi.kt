package com.example.weatherapp.data.api

import com.example.weatherapp.BuildConfig
import com.example.weatherapp.data.dto.WeatherDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("v1/current.json?key=6f934de0b898438ab8f05633222611")
    suspend fun getWeatherData(
        @Query("q") q : String
    ) : WeatherDTO

}