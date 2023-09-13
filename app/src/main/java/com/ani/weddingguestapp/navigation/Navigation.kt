package com.ani.weddingguestapp.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ani.weddingguestapp.data.core.retrofit_client.RetrofitClient
import com.ani.weddingguestapp.data.core.services.ApiServiceProvider
import com.ani.weddingguestapp.data.view_models.home_view_model.HomeViewModel
import com.ani.weddingguestapp.data.view_models.login_view_model.LoginViewModel
import com.ani.weddingguestapp.domain.repositories.login.LoginRepository
import com.ani.weddingguestapp.ui.screens.home.HomeScreen
import com.ani.weddingguestapp.ui.screens.login.Login


@Composable
fun Navigation() {
    val navController = rememberNavController()
    val apiServiceProvider = ApiServiceProvider()
    val repository = LoginRepository(userDataSource = apiServiceProvider.userDataSource)
    val viewModel = LoginViewModel(repository = repository)

    NavHost(
        navController = navController,
        startDestination = Screen.LoginScreen.route,
    ) {
        composable(route = Screen.HomeScreen.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screen.LoginScreen.route) {
            Login(navController = navController, viewModel = viewModel)
        }
    }
}