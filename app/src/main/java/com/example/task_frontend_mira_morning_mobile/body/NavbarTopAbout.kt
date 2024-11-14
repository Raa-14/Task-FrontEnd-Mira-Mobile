package com.example.task_frontend_mira_morning_mobile.body

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.task_frontend_mira_morning_mobile.R

@Composable
fun NavbarTopAbout(navController: NavController) {
    val customFontFamily = FontFamily(
        Font(R.font.medium, FontWeight.Medium),
        Font(R.font.bold, FontWeight.Bold)
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF4ECD8))
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            ConstraintLayout(
                modifier = Modifier.fillMaxWidth()
            ) {
                val (topImg) = createRefs()

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(110.dp)
                        .constrainAs(topImg) {
                            top.linkTo(parent.top)
                            start.linkTo(parent.start)
                            end.linkTo(parent.end)
                        }
                        .background(
                            color = Color(android.graphics.Color.parseColor("#E5A186")),
                        )
                )

                Row(
                    modifier = Modifier
                        .padding(top = 20.dp, start = 10.dp, end = 10.dp)
                        .fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier
                            .height(90.dp)
                            .padding(start = 14.dp)
                            .weight(0.7f),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = "About",
                                color = Color.White,
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold,
                                fontFamily = customFontFamily,

                                )
                            Spacer(modifier = Modifier.weight(1f))
                            Icon(
                                imageVector = Icons.Default.Notifications,
                                contentDescription = "Notification Icon",
                                tint = Color.White,
                                modifier = Modifier.size(35.dp)
                            )
                        }
                    }
                }
            }

        }
    }

}

@Preview
@Composable
private fun NavbarTopAboutPreview() {
    NavbarTopAbout(navController = rememberNavController())
}