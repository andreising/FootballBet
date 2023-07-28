package com.andreisingeleytsev.footballbet.ui.menu

import com.andreisingeleytsev.footballbet.R
import com.andreisingeleytsev.footballnews.ui.utils.Routes

sealed class BottomNavigationItem(val title: String, val icon_id: Int, val route: String) {
    object FavItem: BottomNavigationItem("Favourites", R.drawable.icon_fav, Routes.FAVOURITES_SCREEN)
    object GamesItem: BottomNavigationItem("Games", R.drawable.icon_games, Routes.GAMES_SCREEN)
    object CalendarItem: BottomNavigationItem("Calendar", R.drawable.icon_calendar, Routes.CALENDAR_SCREEN)
}
