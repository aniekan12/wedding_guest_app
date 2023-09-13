package com.ani.weddingguestapp.domain.entities

import com.google.gson.annotations.SerializedName

data class LoginRequestParams(
    @SerializedName("email")
    val email: String,
    @SerializedName("password")
    val password: String,
) {
    override fun toString(): String {
        return "LoginRequestParams(email='$email', password='$password')"
    }
}
