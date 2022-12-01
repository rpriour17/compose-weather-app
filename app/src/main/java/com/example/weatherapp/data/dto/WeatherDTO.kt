package com.example.weatherapp.data.dto

import com.squareup.moshi.Json

data class WeatherDTO(
    //Equivalent to 'current' from the API response
    @field:Json(name = "current")
    val weatherData: WeatherDataDTO

)