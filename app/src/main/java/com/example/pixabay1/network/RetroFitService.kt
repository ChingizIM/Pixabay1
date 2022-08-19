package com.example.pixabay1.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroFitService {
    val retrofit = Retrofit.Builder().baseUrl("https://pixabay.com/")
        .addConverterFactory(GsonConverterFactory.create()).build()

    fun getApi(): PixabayApi = retrofit.create(PixabayApi::class.java)

}