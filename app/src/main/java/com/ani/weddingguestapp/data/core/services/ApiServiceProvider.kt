package com.ani.weddingguestapp.data.core.services

import android.util.Log
import com.ani.weddingguestapp.data.core.retrofit_client.RetrofitClient
import com.ani.weddingguestapp.data.data_sources.UserDataSource

class ApiServiceProvider {


    init {
        Log.d("api service provider:", "api service provider init")
    }

    val userDataSource: UserDataSource = RetrofitClient.instance.create(UserDataSource::class.java)
}