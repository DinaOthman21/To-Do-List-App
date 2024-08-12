package com.example.to_do_list_app.presentation.navigation

sealed class Screen (val route : String) {
    data object HomeScreen :Screen(route = "homeScreen")
    data object UpdateScreen :Screen(route = "updateScreen")
}