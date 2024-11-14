package com.example.task_frontend_mira_morning_mobile.body

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.task_frontend_mira_morning_mobile.R
import com.example.task_frontend_mira_morning_mobile.Routes



@Composable
fun NavbarBottom(navController: NavController) {
    BottomNavigationBar(navController)
}

data class BottomNavigation(
    val title: String,
    val iconRes: Int,
    val iconSelected:Int,
    val route: String
)

val items = listOf(
    BottomNavigation(
        title = "Beranda",
        iconRes = R.drawable.img_3,
        iconSelected = R.drawable.img_8,
        route = Routes.BerandaBody
    ),
    BottomNavigation(
        title = "List Buku",
        iconRes = R.drawable.img_6,
        iconSelected = R.drawable.img_9,
        route = Routes.ListBuku
    ),
    BottomNavigation(
        title = "Koleksi",
        iconRes = R.drawable.img_7,
        iconSelected = R.drawable.img_10,
        route = Routes.Koleksi
    ),
    BottomNavigation(
        title = "About",
        iconRes = R.drawable.img_5,
        iconSelected = R.drawable.img_11,
        route = Routes.About
    )
)

@Composable
fun BottomNavigationBar(navController: NavController) {
    val currentRoute = navController.currentBackStackEntry?.destination?.route

    val customFontFamily = FontFamily(
        Font(R.font.bold, FontWeight.Bold)
    )

    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        NavigationBar(
            containerColor = Color(android.graphics.Color.parseColor("#E5A186")),
            modifier = Modifier.height(80.dp)
        ) {
            items.forEachIndexed { index, item ->
                NavigationBarItem(
                    selected = currentRoute == item.route,
                    onClick = {
                        if (currentRoute != item.route) {
                            navController.navigate(item.route) {
                                popUpTo(navController.graph.startDestinationId)
                                launchSingleTop = true
                            }
                        }
                    },

                icon = {
                    Icon(
                        painter = painterResource(
                            id = if (currentRoute == item.route) {
                                item.iconSelected
                            } else {
                                item.iconRes
                            }
                        ),
                        contentDescription = item.title,
                        modifier = Modifier.size(32.dp)
                    )
                    },
                    label = {
                        Text(
                            text = item.title,
                            fontFamily = customFontFamily,
                            color = Color.White,
                            fontWeight = if (currentRoute == item.route) {
                                FontWeight.Bold
                            } else {
                                FontWeight.Normal
                            },
                            fontSize = 12.sp
                        )
                    },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.Transparent,
                        unselectedIconColor = Color.White,
                        unselectedTextColor = Color.White,
                        selectedIconColor = Color.White,
                        selectedTextColor = Color.White
                    ),
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun BottomNavigationBarPreview() {
    BottomNavigationBar(navController = rememberNavController())
}
