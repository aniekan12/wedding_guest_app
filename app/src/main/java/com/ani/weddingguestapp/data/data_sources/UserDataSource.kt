package com.ani.weddingguestapp.data.data_sources

import android.util.Log
import com.ani.weddingguestapp.data.core.Endpoints
import com.ani.weddingguestapp.data.models.LoginResponse
import com.ani.weddingguestapp.domain.entities.LoginRequestParams
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserDataSource {


    @POST(Endpoints.LOGINURL)
    suspend fun login(@Body request: LoginRequestParams): Response<LoginResponse>

}