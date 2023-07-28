package com.andreisingeleytsev.footballbet.ui.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.andreisingeleytsev.footballbet.ui.screens.calendar_screen.CalendarScreen
import com.andreisingeleytsev.footballbet.ui.screens.favourites_screen.FavouritesScreen
import com.andreisingeleytsev.footballbet.ui.screens.games_screen.GamesScreen
import com.andreisingeleytsev.footballnews.ui.utils.Routes

@Composable
fun FootballMainScreenNavigation(navController: NavHostController, mainNavHostController: NavHostController) {
    NavHost(navController = navController, startDestination = Routes.GAMES_SCREEN) {

        composable(Routes.GAMES_SCREEN) {
            GamesScreen(mainNavHostController)
        }
        composable(Routes.CALENDAR_SCREEN) {
            CalendarScreen(mainNavHostController)
        }
        composable(Routes.FAVOURITES_SCREEN) {
            FavouritesScreen(mainNavHostController)
        }
    }
}