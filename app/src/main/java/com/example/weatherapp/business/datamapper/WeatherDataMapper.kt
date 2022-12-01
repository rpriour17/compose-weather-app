package com.example.weatherapp.business.datamapper

import com.example.weatherapp.business.common.Mapper
import com.example.weatherapp.business.model.WeatherData
import com.example.weatherapp.data.dto.WeatherDataDTO
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object WeatherDataMapper : Mapper<WeatherData, WeatherDataDTO> {

    override fun fromModel(model: WeatherData): WeatherDataDTO? {
        return null
    }

    override fun toModel(source: WeatherDataDTO): WeatherData {
        return WeatherData(
            time = LocalDateTime.parse(source.lastUpdated, DateTimeFormatter.ISO_DATE_TIME),
            humidity = source.humidity.toDouble(),
            windSpeed = source.windMPH.toDouble(),
            pressure = source.pressureIn.toDouble(),
            temp = source.tempF.toDouble()
        )
    }
}