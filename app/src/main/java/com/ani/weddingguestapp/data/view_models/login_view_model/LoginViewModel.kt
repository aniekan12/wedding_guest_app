package com.ani.weddingguestapp.data.view_models.login_view_model

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ani.weddingguestapp.data.models.LoginResponse
import com.ani.weddingguestapp.domain.entities.LoginRequestParams
import com.ani.weddingguestapp.domain.repositories.login.LoginRepository
import kotlinx.coroutines.launch
import java.lang.Exception

class LoginViewModel(private val repository: LoginRepository) : ViewModel() {

    suspend fun login(
        loginRequestParams: LoginRequestParams,
        onResult: (Result<LoginResponse>) -> Unit
    ) {
        viewModelScope.launch {

            try {
                val loginRequest = LoginRequestParams(
                    email = loginRequestParams.email,
                    password = loginRequestParams.password
                )
                Log.i("login request", loginRequest.toString())
                val response = repository.login(loginRequest)
                Log.i("login response", response.toString())

                if (response.isSuccessful) {
                    onResult(Result.success(response.body()!!))
                } else {
                    onResult(Result.failure(Exception(response.message())))
                }

            } catch (e: Exception) {
                Log.i("error", e.toString())
                throw e
            }

        }
    }

}