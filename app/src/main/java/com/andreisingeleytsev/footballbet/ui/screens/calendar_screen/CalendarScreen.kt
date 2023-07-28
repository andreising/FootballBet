package com.andreisingeleytsev.footballbet.ui.screens.calendar_screen

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.andreisingeleytsev.footballbet.R
import com.andreisingeleytsev.footballbet.ui.screens.games_screen.Upcoming
import com.andreisingeleytsev.footballbet.ui.theme.MainColor
import com.andreisingeleytsev.footballbet.ui.theme.PrimaryColor
import com.andreisingeleytsev.footballnews.ui.utils.Routes

@Composable
fun CalendarScreen(navHostController: NavHostController) {
    val sharedPreferences = LocalContext.current.getSharedPreferences("sp", Context.MODE_PRIVATE)
    val currentIcon = remember {
        mutableStateOf(0)
    }
    val currentDay = remember {
        mutableStateOf(0)
    }
    val currentInt = remember {
        mutableStateOf(
            sharedPreferences.getInt("int", 0)
        )
    }
    Column(Modifier.fillMaxSize()) {
        Card(
            shape = RoundedCornerShape(0.dp, 0.dp, 30.dp, 30.dp), colors = CardDefaults.cardColors(
                containerColor = MainColor
            )
        ) {
            Row(
                Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(onClick = {
                    navHostController.navigate(Routes.PROFILE_SCREEN)
                }) {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_profile),
                        contentDescription = null,
                        tint = Color.White
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = null,
                    modifier = Modifier.width(130.dp),
                    contentScale = ContentScale.FillWidth
                )
                IconButton(onClick = {

                }) {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_search),
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            }
            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(), colors = CardDefaults.cardColors(
                    containerColor = PrimaryColor
                )
            ) {
                Row(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState())
                ) {
                    Box(contentAlignment = Alignment.BottomCenter) {
                        Image(
                            painter = painterResource(id = R.drawable.icon_all),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(5.dp)
                                .width(70.dp)
                                .clickable {
                                    currentIcon.value = 0
                                },
                            contentScale = ContentScale.FillWidth
                        )
                        if (currentIcon.value == 0) {
                            Divider(
                                color = Color.Red,
                                modifier = Modifier
                                    .padding(bottom = 20.dp)
                                    .width(60.dp)
                            )
                        }
                    }
                    Box(contentAlignment = Alignment.BottomCenter) {
                        Image(
                            painter = painterResource(id = R.drawable.icon_soccer),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(5.dp)
                                .width(70.dp)
                                .clickable {
                                    currentIcon.value = 1
                                },
                            contentScale = ContentScale.FillWidth
                        )
                        if (currentIcon.value == 1) {
                            Divider(
                                color = Color.Red,
                                modifier = Modifier
                                    .padding(bottom = 20.dp)
                                    .width(60.dp)
                            )
                        }
                    }
                    Box(contentAlignment = Alignment.BottomCenter) {
                        Image(
                            painter = painterResource(id = R.drawable.icon_football),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(5.dp)
                                .width(70.dp)
                                .clickable {
                                    currentIcon.value = 2
                                },
                            contentScale = ContentScale.FillWidth
                        )
                        if (currentIcon.value == 2) {
                            Divider(
                                color = Color.Red,
                                modifier = Modifier
                                    .padding(bottom = 20.dp)
                                    .width(60.dp)
                            )
                        }
                    }
                    Box(contentAlignment = Alignment.BottomCenter) {
                        Image(
                            painter = painterResource(id = R.drawable.icon_basketball),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(5.dp)
                                .width(70.dp)
                                .clickable {
                                    currentIcon.value = 3
                                },
                            contentScale = ContentScale.FillWidth
                        )
                        if (currentIcon.value == 3) {
                            Divider(
                                color = Color.Red,
                                modifier = Modifier
                                    .padding(bottom = 20.dp)
                                    .width(60.dp)
                            )
                        }
                    }
                    Box(contentAlignment = Alignment.BottomCenter) {
                        Image(
                            painter = painterResource(id = R.drawable.icon_hockey),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(5.dp)
                                .width(70.dp)
                                .clickable {
                                    currentIcon.value = 4
                                },
                            contentScale = ContentScale.FillWidth
                        )
                        if (currentIcon.value == 4) {
                            Divider(
                                color = Color.Red,
                                modifier = Modifier
                                    .padding(bottom = 20.dp)
                                    .width(60.dp)
                            )
                        }
                    }
                    Box(contentAlignment = Alignment.BottomCenter) {
                        Image(
                            painter = painterResource(id = R.drawable.icon_baseball),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(5.dp)
                                .width(70.dp)
                                .clickable {
                                    currentIcon.value = 5
                                },
                            contentScale = ContentScale.FillWidth
                        )
                        if (currentIcon.value == 5) {
                            Divider(
                                color = Color.Red,
                                modifier = Modifier
                                    .padding(bottom = 20.dp)
                                    .width(60.dp)
                            )
                        }
                    }
                }
            }
            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(), colors = CardDefaults.cardColors(
                    containerColor = PrimaryColor
                )
            ) {
                Row(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState())
                ) {
                    Box(contentAlignment = Alignment.BottomCenter) {
                        Image(
                            painter = painterResource(id = R.drawable.j28),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(5.dp)
                                .width(70.dp)
                                .clickable {
                                    currentDay.value = 0
                                },
                            contentScale = ContentScale.FillWidth
                        )
                        if (currentDay.value == 0) {
                            Divider(
                                color = Color.Red,
                                modifier = Modifier
                                    .padding(bottom = 20.dp)
                                    .width(60.dp)
                            )
                        }
                    }
                    Box(contentAlignment = Alignment.BottomCenter) {
                        Image(
                            painter = painterResource(id = R.drawable.j29),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(5.dp)
                                .width(70.dp)
                                .clickable {
                                    currentDay.value = 1
                                },
                            contentScale = ContentScale.FillWidth
                        )
                        if (currentDay.value == 1) {
                            Divider(
                                color = Color.Red,
                                modifier = Modifier
                                    .padding(bottom = 20.dp)
                                    .width(60.dp)
                            )
                        }
                    }
                    Box(contentAlignment = Alignment.BottomCenter) {
                        Image(
                            painter = painterResource(id = R.drawable.j30),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(5.dp)
                                .width(70.dp)
                                .clickable {
                                    currentDay.value = 2
                                },
                            contentScale = ContentScale.FillWidth
                        )
                        if (currentDay.value == 2) {
                            Divider(
                                color = Color.Red,
                                modifier = Modifier
                                    .padding(bottom = 20.dp)
                                    .width(60.dp)
                            )
                        }
                    }
                    Box(contentAlignment = Alignment.BottomCenter) {
                        Image(
                            painter = painterResource(id = R.drawable.j31),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(5.dp)
                                .width(70.dp)
                                .clickable {
                                    currentDay.value = 3
                                },
                            contentScale = ContentScale.FillWidth
                        )
                        if (currentDay.value == 3) {
                            Divider(
                                color = Color.Red,
                                modifier = Modifier
                                    .padding(bottom = 20.dp)
                                    .width(60.dp)
                            )
                        }
                    }
                    Box(contentAlignment = Alignment.BottomCenter) {
                        Image(
                            painter = painterResource(id = R.drawable.a1),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(5.dp)
                                .width(70.dp)
                                .clickable {
                                    currentDay.value = 4
                                },
                            contentScale = ContentScale.FillWidth
                        )
                        if (currentDay.value == 4) {
                            Divider(
                                color = Color.Red,
                                modifier = Modifier
                                    .padding(bottom = 20.dp)
                                    .width(60.dp)
                            )
                        }
                    }
                    Box(contentAlignment = Alignment.BottomCenter) {
                        Image(
                            painter = painterResource(id = R.drawable.a2),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(5.dp)
                                .width(70.dp)
                                .clickable {
                                    currentDay.value = 5
                                },
                            contentScale = ContentScale.FillWidth
                        )
                        if (currentDay.value == 5) {
                            Divider(
                                color = Color.Red,
                                modifier = Modifier
                                    .padding(bottom = 20.dp)
                                    .width(60.dp)
                            )
                        }
                    }
                }
            }
        }
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Calendar",
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(10.dp)
                    .clickable(onClick = {}),
                textAlign = TextAlign.Center
            )
            when (currentIcon.value) {
                0 -> {
                    if (currentDay.value==5) {
                        SerieBCalendar()
                    } else Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Text(
                            "No matches found",
                            fontSize = 18.sp,
                            modifier = Modifier
                                .padding(10.dp)
                                .clickable(onClick = {}),
                            textAlign = TextAlign.Center
                        )
                    }
                }

                1 -> {
                    if (currentDay.value==5) {
                        SerieBCalendar()
                    } else Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Text(
                            "No matches found",
                            fontSize = 18.sp,
                            modifier = Modifier
                                .padding(10.dp)
                                .clickable(onClick = {}),
                            textAlign = TextAlign.Center
                        )
                    }
                }

                2 -> {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Text(
                            "No matches found",
                            fontSize = 18.sp,
                            modifier = Modifier
                                .padding(10.dp)
                                .clickable(onClick = {}),
                            textAlign = TextAlign.Center
                        )
                    }
                }

                3 -> {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Text(
                            "No matches found",
                            fontSize = 18.sp,
                            modifier = Modifier
                                .padding(10.dp)
                                .clickable(onClick = {}),
                            textAlign = TextAlign.Center
                        )
                    }
                }

                4 -> {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Text(
                            "No matches found",
                            fontSize = 18.sp,
                            modifier = Modifier
                                .padding(10.dp)
                                .clickable(onClick = {}),
                            textAlign = TextAlign.Center
                        )
                    }
                }

                5 -> {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Text(
                            "No matches found",
                            fontSize = 18.sp,
                            modifier = Modifier
                                .padding(10.dp)
                                .clickable(onClick = {}),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun SerieBCalendar() {
    val context = LocalContext.current
    val sharedPreferences = context.getSharedPreferences("sp", Context.MODE_PRIVATE)
    val currentInt = remember {
        mutableStateOf(
            sharedPreferences.getInt("int", 0)
        )
    }
    Column(
        Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {

        Card(modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(20.dp), colors = CardDefaults.cardColors(
            containerColor = Color.White
        )) {
            Column(Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(id = R.drawable.match_1),
                    contentDescription = null,
                    Modifier
                        .fillMaxWidth()
                        .clickable {
                            if (currentInt.value == 1 || currentInt.value == 3) {
                                currentInt.value = currentInt.value - 1
                                sharedPreferences
                                    .edit()
                                    .putInt("int", currentInt.value)
                                    .apply()
                                Toast
                                    .makeText(
                                        context,
                                        "Removed from favourites",
                                        Toast.LENGTH_SHORT
                                    )
                                    .show()
                            } else {
                                currentInt.value = currentInt.value + 1
                                sharedPreferences
                                    .edit()
                                    .putInt("int", currentInt.value)
                                    .apply()
                                Toast
                                    .makeText(context, "Added to favourites", Toast.LENGTH_SHORT)
                                    .show()
                            }
                        },
                    contentScale = ContentScale.FillWidth
                )
                Image(
                    painter = painterResource(id = R.drawable.match_2),
                    contentDescription = null,
                    Modifier
                        .padding(start = 7.dp, end = 45.dp)
                        .fillMaxWidth()
                        .clickable {
                            if (currentInt.value == 2 || currentInt.value == 3) {
                                currentInt.value = currentInt.value - 2
                                sharedPreferences
                                    .edit()
                                    .putInt("int", currentInt.value)
                                    .apply()
                                Toast
                                    .makeText(
                                        context,
                                        "Removed from favourites",
                                        Toast.LENGTH_SHORT
                                    )
                                    .show()
                            } else {
                                currentInt.value = currentInt.value + 2
                                sharedPreferences
                                    .edit()
                                    .putInt("int", currentInt.value)
                                    .apply()
                                Toast
                                    .makeText(context, "Added to favourites", Toast.LENGTH_SHORT)
                                    .show()
                            }
                        },
                    contentScale = ContentScale.FillWidth
                )
            }
        }
    }
}