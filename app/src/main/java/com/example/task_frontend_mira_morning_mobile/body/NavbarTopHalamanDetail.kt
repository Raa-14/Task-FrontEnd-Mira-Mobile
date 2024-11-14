package com.example.task_frontend_mira_morning_mobile.body

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp

import com.example.task_frontend_mira_morning_mobile.R

@Composable
fun NavbarTopHalamanDetail(navController: NavController, modifier: Modifier = Modifier) {
    val customFontFamily = FontFamily(
        Font(R.font.medium, FontWeight.Medium),
        Font(R.font.bold, FontWeight.Bold)
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFE5A186))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier
            ){
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Kembali",
                    tint = Color.White,
                    modifier = Modifier
                        .clickable() {
                            navController.popBackStack()
                        }
                        .padding(end = 5.dp)
                )
                Text(
                    "Detail Makanan",
                    fontFamily = customFontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 20.sp,
                    color = Color.White
                )
            }

        }
    }
}