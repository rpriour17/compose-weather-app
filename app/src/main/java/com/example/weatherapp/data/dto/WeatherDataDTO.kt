package com.example.weatherapp.data.dto

import com.squareup.moshi.Json

data class WeatherDataDTO (

    @field:Json(name = "last_updated_epoch")
    val lastUpdatedEpoch: Int,
    @field:Json(name = "last_updated")
    val lastUpdated: String,
    @field:Json(name = "temp_c")
    val tempC: Int,
    @field:Json(name = "temp_f")
    val tempF: Int,
    @field:Json(name = "is_day")
    val isDay: Int,
    @field:Json(name = "condition")
    val condition: ConditionDTO,
    @field:Json(name = "wind_mph")
    val windMPH: Int,
    @field:Json(name = "wind_kph")
    val windKPH: Int,
    @field:Json(name = "wind_degree")
    val windDegree: Int,
    @field:Json(name = "wind_dir")
    val windDir: String,
    @field:Json(name = "pressure_mb")
    val pressureMB: Int,
    @field:Json(name = "pressure_in")
    val pressureIn: Int,
    @field:Json(name = "precip_mm")
    val precipMM: Int,
    @field:Json(name = "precip_in")
    val precipIN: Int,
    @field:Json(name = "humidity")
    val humidity: Int,
    @field:Json(name = "cloud")
    val cloud: Int,
    @field:Json(name = "feelslike_c")
    val feelsLikeC: Int,
    @field:Json(name = "feels_like_f")
    val feelsLikeF: Int,
    @field:Json(name = "vis_km")
    val visKM: Int,
    @field:Json(name = "vis_miles")
    val visMiles: Int,
    @field:Json(name = "uv")
    val uv: Int,
    @field:Json(name = "gust_mph")
    val gustMPH: Int,
    @field:Json(name = "gust_kph")
    val gustKPH: Int,

)