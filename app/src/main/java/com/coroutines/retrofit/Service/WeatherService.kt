package com.coroutines.retrofit.Service

import com.coroutines.retrofit.Model.WeatherResponse
import retrofit2.http.GET

//requisicoes rest feitas dentro de interfaces
interface WeatherService
{
    //funcoes de interface nao tem implementacao
    @GET("4418.json")
    suspend fun getWeather():WeatherResponse
}