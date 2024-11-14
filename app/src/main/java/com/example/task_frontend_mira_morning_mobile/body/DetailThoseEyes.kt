package com.example.task_frontend_mira_morning_mobile.body

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.task_frontend_mira_morning_mobile.R

@Composable
fun DetailThoseEyes(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF4ECD8))
    ) {
        NavbarTopHalamanDetail(navController)

        Card(
            shape = RoundedCornerShape(8.dp),
            elevation = CardDefaults.cardElevation(4.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(16.dp)

            ) {
                // Gambar buku
                Image(
                    painter = painterResource(id = R.drawable.thoseeyes),
                    contentDescription = "Cover Buku",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .size(150.dp)
                        .padding(bottom = 16.dp)
                )

                // Text "Keterangan Buku" Bold
                Text(
                    text = "Keterangan Buku",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp),
                    textAlign = TextAlign.Start
                )

                // Informasi Buku
                Text(
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) { append("Judul: ") }
                        append("Those Eyes\n")

                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) { append("Penulis: ") }
                        append("David Brin\n")

                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) { append("Tahun Terbit: ") }
                        append("1992\n")

                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) { append("Penerbit: ") }
                        append("Viking Press\n")

                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) { append("Sinopsis: ") }
                        append(
                            "Novel ini mengambil pembaca pada perjalanan melalui konsep UFO dan alien. Cerita ini mengikuti seorang " +
                                    "pembawa acara radio yang menantang alien untuk muncul dan menghadapi manusia secara langsung. " +
                                    "Dalam prosesnya, pembawa acara radio harus menghadapi berbagai tekanan dan ancaman dari " +
                                    "alien yang ingin tetap tersembunyi.\n"
                        )
                    },
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}

@Preview
@Composable
private fun DetailThoseEyesPreview() {
    DetailThoseEyes(navController = rememberNavController())
}