package com.ani.weddingguestapp.domain.repositories.login

import com.ani.weddingguestapp.data.data_sources.UserDataSource
import com.ani.weddingguestapp.data.models.LoginResponse
import com.ani.weddingguestapp.domain.entities.LoginRequestParams
import retrofit2.Response

class LoginRepository(private val userDataSource: UserDataSource) {
    suspend fun login(loginRequestParams: LoginRequestParams): Response<LoginResponse> {
        val request = LoginRequestParams(
            email = loginRequestParams.email,
            password = loginRequestParams.password
        )
        return userDataSource.login(request = request)

    }
}