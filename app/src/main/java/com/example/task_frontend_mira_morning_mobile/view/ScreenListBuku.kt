package com.example.task_frontend_mira_morning_mobile.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.task_frontend_mira_morning_mobile.body.NavbarBottom
import com.example.task_frontend_mira_morning_mobile.body.NavbarTopListBuku


@Composable
fun ListBuku(navController: NavController) {
    Scaffold(

        bottomBar = {
            NavbarBottom(navController)
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .background(Color(android.graphics.Color.parseColor("#E5A186")))
        ) {
            NavbarTopListBuku(navController)


        }
    }
}
@Preview
@Composable
private fun ListBukuPreview() {
    ListBuku(navController = rememberNavController())
}