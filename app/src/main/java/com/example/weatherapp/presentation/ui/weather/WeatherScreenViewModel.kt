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

    var state by mutableStateOf(WeatherData(
        pressure = 0.0,
        )
    )
    init {
        loadWeatherInfo()
    }


    //Grabs weather data from api and maps to state
    fun loadWeatherInfo() {
        viewModelScope.launch {
            val result = repository.getWeatherData("Paris")
            when (result) {
                    is Resource.Success -> {
                    state = state.copy(
                        pressure = result.data!!.pressure,
                    )
                }
                    is Resource.Error -> {
                    state= state.copy(
                        pressure = 50.0
                    )
                }
            }
//            locationTrackerImpl.getCurrentLocation()?.let { location ->
//                // Latitude,Longitude
//                val param = location.latitude.toString() + "," + location.longitude.toString()
//                val result = repository.getWeatherData(param)
//                when (result) {
//                    is Resource.Success -> {
//                        state = state.copy(
//                            pressure = result.data!!.pressure,
//                        )
//                    }
//                    is Resource.Error -> {
//                        state= state.copy(
//                            pressure = 50.0
//                        )
//                    }
//                }
//            } ?: kotlin.run {
//                state = state.copy(
//                    isLoading = false,
//                    error = "Couldn't retrieve location"
//                )
//            }
        }
    }


}