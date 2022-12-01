package com.example.weatherapp.presentation.ui.weather

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.core.graphics.ColorUtils
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.viewModelFactory
import dagger.hilt.android.lifecycle.HiltViewModel

@Composable
fun WeatherScreen() {
    mainWeatherCard()
}

@Composable
fun mainWeatherCard(
    viewModel: WeatherScreenViewModel = hiltViewModel(),
    modifier: Modifier = Modifier
) {
    Card(
        backgroundColor = Color.Blue,
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier.padding(16.dp)
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = "Today the pressure is ${
                    viewModel.state.pressure
                }"
            )
        }
    }
}