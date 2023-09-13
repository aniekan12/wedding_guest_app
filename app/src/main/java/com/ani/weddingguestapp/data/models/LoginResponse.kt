package com.ani.weddingguestapp.data.models

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("status")
    val status: Boolean,
    @SerializedName("display_message")
    val displayMessage: String,
    @SerializedName("dev_message")
    val devMessage: String,
    @SerializedName("data")
    val data: Data
) {
    override fun toString(): String {
        return "LoginResponse(status=$status, displayMessage='$displayMessage', devMessage='$devMessage', data=$data)"
    }
}

data class Data(
    @SerializedName("user_token")
    val userToken: String,
    @SerializedName("user_details")
    val userDetails: UserDetails
) {
    override fun toString(): String {
        return "Data(userToken='$userToken', userDetails=$userDetails)"
    }
}

data class UserDetails(
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("role")
    val role: String,
    @SerializedName("email")
    val email: String,
) {
    override fun toString(): String {
        return "UserDetails(fullName='$fullName', role='$role', email='$email')"
    }
}