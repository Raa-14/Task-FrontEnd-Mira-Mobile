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
fun DetailJiwaNegarawan(navController: NavController) {
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
                    painter = painterResource(id = R.drawable.jiwaseorangnegarawan),
                    contentDescription = "Cover Buku",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .size(150.dp)
                        .padding(bottom = 16.dp)
                )

                // Text "Keterangan Buku"
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
                        append("Jiwa Seorang Negarawan, Biografi Tun Azizan Zainul Abidin\n")

                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) { append("Penulis: ") }
                        append("Azam Aris\n")

                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) { append("Penerbit: ") }
                        append("CRESTIME\n")

                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) { append("Sinopsis: ") }
                        append(
                            "Buku ini mengisahkan kisah hidup Tun Azizan Zainul Abidin, seorang tokoh penting dalam pentadbiran Malaysia. " +
                                    "Buku ini menguraikan perjalanan hidupnya dari awal hingga akhir, termasuk perjuangannya sebagai seorang pejabat " +
                                    "awam yang berdedikasi dan berpengetahuan luas2. Tun Azizan dikenal dengan kontribusinya terhadap pembangunan Malaysia, " +
                                    "termasuk peranannya dalam menyelamatkan Bank Bumiputra, serta keterlibatannya dalam projek-projek besar seperti KLCC dan " +
                                    "Putrajaya.\n"
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
private fun DetailJiwaNegarawanPreview() {
    DetailJiwaNegarawan(navController = rememberNavController())
}