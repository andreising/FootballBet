package com.andreisingeleytsev.footballbet.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.andreisingeleytsev.footballbet.ui.screens.main_screen.MainScreen
import com.andreisingeleytsev.footballbet.ui.screens.profile_screen.ProfileScreen
import com.andreisingeleytsev.footballbet.ui.screens.splash_screen.FootballBetSplashScreen
import com.andreisingeleytsev.footballnews.ui.utils.Routes

@Composable
fun FootballBetMainNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.SPLASH_SCREEN) {

        composable(Routes.SPLASH_SCREEN) {
            FootballBetSplashScreen(navController)
        }
        composable(Routes.MAIN_SCREEN) {
            MainScreen(navController)
        }
        composable(Routes.PROFILE_SCREEN) {
            ProfileScreen(navController)
        }
    }
}