package com.example.weatherapp.data.api

import com.example.weatherapp.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("v1/current.json?key=${BuildConfig.API_KEY}")
    suspend fun getWeatherData(
        @Query("q") q : String
    )

}