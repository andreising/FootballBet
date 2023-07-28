package com.andreisingeleytsev.footballbet.ui.screens.main_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.andreisingeleytsev.footballbet.ui.menu.BottomNavigationMenu
import com.andreisingeleytsev.footballbet.ui.navigation.FootballMainScreenNavigation

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navHostController: NavHostController) {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    Scaffold(bottomBar = {
        BottomNavigationMenu(currentRoute = currentRoute){route->
            navController.navigate(route)
        }
    }) {
        Box(modifier = Modifier
            .padding(it)
            .fillMaxSize()) {
            FootballMainScreenNavigation(navController, navHostController)
        }
    }
}