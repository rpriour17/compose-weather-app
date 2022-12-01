package com.example.weatherapp.presentation.ui.weather

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.business.common.Resource
import com.example.weatherapp.business.model.WeatherData
import com.example.weatherapp.business.repositories.WeatherRepository
import com.example.weatherapp.data.location.LocationTrackerImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.time.LocalDateTime
import javax.inject.Inject

@HiltViewModel
class WeatherScreenViewModel @Inject constructor(
    private val repository: WeatherRepository,
    private val locationTrackerImpl: LocationTrackerImpl
) : ViewModel() {

    private var state by mutableStateOf(WeatherData(
        time = LocalDateTime.MIN,
        temp = 0.0,
        humidity = 0.0,
        pressure = 0.0,
        windSpeed = 0.0,
        isLoading = false,
        error = null
        )
    )

    //Grabs weather data from api and maps to state
    fun loadWeatherInfo() {
        viewModelScope.launch {
            state = state.copy(
                isLoading = true
            )
            locationTrackerImpl.getCurrentLocation()?.let { location ->
                // Latitude,Longitude
                val param = location.latitude.toString() + "," + location.longitude.toString()
                val result = repository.getWeatherData(param)
                when (result) {
                    is Resource.Success -> {
                        state = state.copy(
                            time = result.data!!.time,
                            temp = result.data.temp,
                            humidity = result.data.humidity,
                            pressure = result.data.pressure,
                            windSpeed = result.data.windSpeed,
                            isLoading = false,
                            error = null
                        )
                    }
                    is Resource.Error -> {
                        state= state.copy(
                            isLoading = false,
                            error = result.message
                        )
                    }
                }
            } ?: kotlin.run {
                state = state.copy(
                    isLoading = false,
                    error = "Couldn't retrieve location"
                )
            }
        }
    }


}