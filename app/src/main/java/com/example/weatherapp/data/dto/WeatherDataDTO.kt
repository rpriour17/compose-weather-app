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
    @Json(name = "condition")
    val condition: ConditionDTO,
    @Json(name = "wind_mph")
    val windMPH: Int,
    @Json(name = "wind_kph")
    val windKPH: Int,
    @Json(name = "wind_degree")
    val windDegree: Int,
    @Json(name = "wind_dir")
    val windDir: String,
    @Json(name = "pressure_mb")
    val pressureMB: Int,
    @Json(name = "pressure_in")
    val pressureIn: Int,
    @Json(name = "precip_mm")
    val precipMM: Int,
    @Json(name = "precip_in")
    val precipIN: Int,
    @Json(name = "humidity")
    val humidity: Int,
    @Json(name = "cloud")
    val cloud: Int,
    @Json(name = "feelslike_c")
    val feelsLikeC: Int,
    @Json(name = "feels_like_f")
    val feelsLikeF: Int,
    @Json(name = "vis_km")
    val visKM: Int,
    @Json(name = "vis_miles")
    val visMiles: Int,
    @Json(name = "uv")
    val uv: Int,
    @Json(name = "gust_mph")
    val gustMPH: Int,
    @Json(name = "gust_kph")
    val gustKPH: Int,

)