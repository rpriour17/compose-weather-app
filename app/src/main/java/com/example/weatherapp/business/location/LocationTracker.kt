package com.example.weatherapp.business.location

import android.location.Location

interface LocationTracker {

    suspend fun getCurrentLocation(): Location?
}