package com.example.pixabay1

import android.app.Application
import com.example.pixabay1.network.PixabayApi
import com.example.pixabay1.network.RetroFitService

class App:Application() {

    companion object {
        lateinit var api: PixabayApi
    }

    override fun onCreate() {
        super.onCreate()
        val retroFitService = RetroFitService()
        api= retroFitService.getApi()
    }
}