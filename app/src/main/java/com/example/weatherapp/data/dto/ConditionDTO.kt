package com.example.weatherapp.data.dto

import com.squareup.moshi.Json

data class ConditionDTO(

    @field:Json(name = "text")
    val text : String,
    @field:Json(name = "icon")
    val icon : String,
    @field:Json(name = "code")
    val code : Int,

)