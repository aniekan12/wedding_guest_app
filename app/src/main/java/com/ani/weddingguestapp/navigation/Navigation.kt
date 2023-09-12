package com.ani.weddingguestapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ani.weddingguestapp.data.view_models.home_view_model.HomeViewModel
import com.ani.weddingguestapp.ui.screens.home.HomeScreen
import com.ani.weddingguestapp.ui.screens.login.Login


@Composable
fun Navigation() {
     val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route,
    ) {
        composable(route=Screen.HomeScreen.route){
            HomeScreen(navController = navController )
        }
        composable(route=Screen.LoginScreen.route){
            Login(navController = navController )
        } 
    }
}