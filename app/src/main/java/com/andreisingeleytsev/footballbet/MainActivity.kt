package com.andreisingeleytsev.footballbet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.andreisingeleytsev.footballbet.ui.navigation.FootballBetMainNavigation


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FootballBetMainNavigation()
        }
    }
}
