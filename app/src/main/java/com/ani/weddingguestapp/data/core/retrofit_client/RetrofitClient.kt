package com.ani.weddingguestapp.data.core.retrofit_client

import android.util.Log
import com.ani.weddingguestapp.data.core.Endpoints
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    init {
        Log.d("retrofit init", "init retrofitttt")
    }

    val instance: Retrofit by lazy {
        Retrofit
            .Builder()
            .baseUrl(Endpoints.BASEURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}