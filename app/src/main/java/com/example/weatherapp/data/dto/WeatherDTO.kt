package com.example.weatherapp.data.dto

import com.squareup.moshi.Json

data class WeatherDTO(
    @field:Json(name = "current")
    val weatherData: WeatherDataDTO

)