package com.example.task_frontend_mira_morning_mobile.body
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.text.withStyle
import com.example.task_frontend_mira_morning_mobile.R


@Composable
fun About(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF4ECD8))
    ) {
        // Gambar
        Box(
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Image(
                painter = painterResource(id = R.drawable.mira),
                contentDescription = "Profile Picture",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(140.dp)
                    .clip(CircleShape)
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Nama
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(15.dp))
                .background(Color(0xFFD4A373))
                .padding(10.dp)
        ) {
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append("Nama: ")
                    }
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Normal)) {
                        append("Mira Handayani")
                    }
                },
                fontSize = 18.sp,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Email
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(15.dp))
                .background(Color(0xFFD4A373))
                .padding(10.dp)
        ) {
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append("Email: ")
                    }
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Normal)) {
                        append("raaanii14@gmail.com")
                    }
                },
                fontSize = 18.sp,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Asal Perguruan Tinggi
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(15.dp))
                .background(Color(0xFFD4A373))
                .padding(10.dp)
        ) {
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append("Asal Perguruan Tinggi: ")
                    }
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Normal)) {
                        append("Politeknik Negeri Batam")
                    }
                },
                fontSize = 18.sp,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Jurusan
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(15.dp))
                .background(Color(0xFFD4A373))
                .padding(10.dp)

        ) {
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append("Jurusan: ")
                    }
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Normal)) {
                        append("Teknologi Rekayasa Perangkat Lunak")
                    }
                },
                fontSize = 18.sp,
                color = Color.Black
            )
        }
    }
}



@Preview
@Composable
private fun AboutPreview() {
    About(navController = rememberNavController())
}
