package com.myu.myuweatherapp.repository

import com.myu.myuweatherapp.api.ApiService
import javax.inject.Inject

class WeatherRepository
@Inject
constructor(private val apiService: ApiService) {

    suspend fun getWeather() =  apiService.getWeather()

}