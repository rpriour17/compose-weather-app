package com.example.weatherapp.presentation.ui.weather

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weatherapp.R
import com.example.weatherapp.presentation.ui.theme.WeatherAppTheme

@Composable
fun WeatherScreen() {
    MainWeatherCard()
}

@Composable
fun MainWeatherCard(
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
                text = "12:00",
                modifier = Modifier.align(Alignment.End),
                color = Color.White
            )
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                painter = painterResource(id = R.drawable.d_113),
                contentDescription = null,
                modifier = Modifier.size(200.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Preview
@Composable
fun MainWeatherCardPreview() {
    WeatherAppTheme {
        MainWeatherCard()
    }
}