package com.andreisingeleytsev.footballbet.ui.screens.splash_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.andreisingeleytsev.footballbet.R
import com.andreisingeleytsev.footballnews.ui.utils.Routes
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun FootballBetSplashScreen(navHostController: NavHostController) {
    //
    //
    //
    //
    //
    val cotoutine = rememberCoroutineScope()
    LaunchedEffect(key1 = true){
        cotoutine.launch {
            delay(3000)
            navHostController.navigate(Routes.MAIN_SCREEN) {
                popUpTo(Routes.SPLASH_SCREEN){
                    inclusive = true
                }
            }
        }
    }
    Image(
        painter = painterResource(id = R.drawable.splash_bg),
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
}