package com.myu.myuweatherapp.api

import com.myu.myuweatherapp.model.Weather
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("weather/Curitiba")
    suspend fun getWeather() : Response<Weather>
}