package com.example.weatherapp.data.dto

import com.squareup.moshi.Json

data class WeatherDataDTO (
    @field:Json(name="pressure_in")
    val pressure : Double
)