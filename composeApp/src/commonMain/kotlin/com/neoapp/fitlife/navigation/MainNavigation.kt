package com.neoapp.fitlife.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.neoapp.fitlife.presenter.screens.splash.WelcomeScreen
import com.neoapp.fitlife.presenter.ui.Screen

@Composable
fun MainNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Splash.route){

        composable(Screen.Splash.route) {
            WelcomeScreen()
        }

    }

}