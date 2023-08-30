package com.ani.weddingguestapp.navigation

import com.ani.weddingguestapp.navigation.routes.ScreenRoutes

sealed class Screen(val route: String) {
    object HomeScreen : Screen(route = ScreenRoutes.homeScreenRoute)
    object DetailScreen : Screen(route = ScreenRoutes.detailScreenRoute)
    object AddNewGuestScreen : Screen(route = ScreenRoutes.addNewGuestScreenRoute)
}