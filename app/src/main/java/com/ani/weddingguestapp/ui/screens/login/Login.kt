package com.ani.weddingguestapp.ui.screens.login

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ani.weddingguestapp.R
import com.ani.weddingguestapp.composables.AppButton
import com.ani.weddingguestapp.data.common.enums.LoginState
import com.ani.weddingguestapp.data.core.retrofit_client.RetrofitClient
import com.ani.weddingguestapp.data.core.services.ApiServiceProvider
import com.ani.weddingguestapp.data.view_models.login_view_model.LoginViewModel
import com.ani.weddingguestapp.domain.entities.LoginRequestParams
import com.ani.weddingguestapp.domain.repositories.login.LoginRepository
import com.ani.weddingguestapp.ui.theme.Red
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


@Composable
fun Login(navController: NavController, viewModel: LoginViewModel) {

    val apiServiceProvider = ApiServiceProvider()
    val repository = LoginRepository(userDataSource = apiServiceProvider.userDataSource)
    val viewModel = LoginViewModel(repository = repository)

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    val showMessage = rememberUpdatedState(newValue = "")
    var loginState by remember {
        mutableStateOf(LoginState.LOADING)
    }


    Scaffold(

    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(all = 10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                label = {
                    Text(text = "Email", style = TextStyle(color = Red))
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Red,

                    ),
                maxLines = 8,
                value = email,
                onValueChange = { text ->
                    email = text
                })

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                label = {
                    Text(text = "Password", style = TextStyle(color = Red))
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Red,

                    ),
                maxLines = 8,
                value = password,
                onValueChange = { text ->
                    password = text
                })

            AppButton(
                enabled = email.isNotEmpty() && password.isNotEmpty(),
                buttonText = R.string.login,
                padding = 30,
                onClick = {
                    GlobalScope.launch(Dispatchers.IO) {
                        loginState = LoginState.LOADING
                        val loginRequestParams = LoginRequestParams(
                            email = email,
                            password = password,
                        )
                        viewModel.login(loginRequestParams) { result ->


                        }
                    }

                }
            )


        }


    }
}