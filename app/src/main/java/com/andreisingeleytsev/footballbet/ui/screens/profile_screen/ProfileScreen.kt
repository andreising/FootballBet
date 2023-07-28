package com.andreisingeleytsev.footballbet.ui.screens.profile_screen

import android.content.Context
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.andreisingeleytsev.footballbet.R
import com.andreisingeleytsev.footballbet.ui.theme.MainColor
import com.andreisingeleytsev.footballbet.ui.theme.PrimaryColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(navHostController: NavHostController) {
    val sp = LocalContext.current.getSharedPreferences("sp", Context.MODE_PRIVATE)
    val name = remember {
        mutableStateOf(
            sp.getString("name", "")!!
        )
    }
    var expanded = remember { mutableStateOf(false) }
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Card(shape = RoundedCornerShape(0.dp, 0.dp, 30.dp, 30.dp),
        colors = CardDefaults.cardColors(
            containerColor = MainColor
        )) {
            Row(
                Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(onClick = {
                    navHostController.popBackStack()
                }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null,
                        tint = Color.White
                    )
                }
                Text(text = "Profile", style = TextStyle(
                    color = Color.White, fontWeight = FontWeight.Bold, fontSize = 24.sp
                ))
                Text(text = "Edit", style = TextStyle(
                    color = Color.White, fontSize = 16.sp
                ), modifier = Modifier.clickable {
                    sp.edit().putString("name", name.value).apply()
                    navHostController.popBackStack()
                })
            }
        }
        Row(
            Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Your name:", style = TextStyle(
                    color = Color.LightGray, fontSize = 14.sp
                )
            )
            Spacer(modifier = Modifier.width(30.dp))
            Card(modifier = Modifier.fillMaxWidth()) {
                TextField(value = name.value, onValueChange = {
                    name.value = it
                }, colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.White
                ))
            }
        }
        OutlinedButton(
            onClick = {
                sp.edit().putString("name", name.value).apply()
            }, colors = ButtonDefaults.outlinedButtonColors(
                containerColor = Color.White
            ), border = BorderStroke(1.dp, PrimaryColor)
        ) {
            Text(
                text = "SAVE", style = TextStyle(
                    color = PrimaryColor, fontSize = 14.sp,
                )
            )
        }
    }
}