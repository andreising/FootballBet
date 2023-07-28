package com.andreisingeleytsev.footballbet.ui.menu

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.andreisingeleytsev.footballbet.ui.theme.MainColor


@Composable
fun BottomNavigationMenu(currentRoute: String?,onNavigate: (String)->Unit) {
    val listItems = listOf(
        BottomNavigationItem.FavItem,
        BottomNavigationItem.GamesItem,
        BottomNavigationItem.CalendarItem
    )
    BottomAppBar(
        containerColor = MainColor
    ) {
        listItems.forEach { item ->
            NavigationBarItem(
                selected = currentRoute==item.route,
                onClick = {
                          onNavigate(item.route)
                },
                icon = {
                    Icon(
                        painter = painterResource(id = item.icon_id),
                        contentDescription = "bottom_icon"
                    )
                },
                label = {
                    Text(text = item.title)
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.White,
                    selectedTextColor = Color.White,
                    unselectedIconColor = Color.Gray,
                    unselectedTextColor = Color.Gray,
                    indicatorColor = MainColor
                )
            )

        }
    }
}