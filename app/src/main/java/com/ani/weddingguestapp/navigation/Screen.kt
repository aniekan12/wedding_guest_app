package com.ani.weddingguestapp.navigation

import com.ani.weddingguestapp.navigation.routes.ScreenRoutes

sealed class Screen(val route: String) {
    object LoginScreen : Screen(route = ScreenRoutes.loginScreenRoute)
    object HomeScreen : Screen(route = ScreenRoutes.homeScreenRoute)
    object DetailScreen : Screen(route = ScreenRoutes.detailScreenRoute)
    object AddNewGuestScreen : Screen(route = ScreenRoutes.addNewGuestScreenRoute)
}