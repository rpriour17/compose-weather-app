package com.example.weatherapp.business.model

import java.time.LocalDateTime

data class WeatherData(
    val time : LocalDateTime,
    val temp : Double,
    val pressure: Double,
    val windSpeed: Double,
    val humidity: Double,
    val isLoading : Boolean,
    val error : String?
)
