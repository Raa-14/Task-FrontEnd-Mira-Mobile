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
fun DetailRindu(navController: NavController) {
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
                    painter = painterResource(id = R.drawable.rindu),
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
                        append("Rindu\n")

                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) { append("Penulis: ") }
                        append("Tere Liye\n")

                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) { append("Tahun Terbit: ") }
                        append("2014\n")

                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) { append("Penerbit: ") }
                        append("Republika\n")

                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) { append("Sinopsis: ") }
                        append(
                            "Novel ini menceritakan tentang perjalanan panjang sebuah kapal besar bernama Blitar Holland yang melakukan perjalanan" +
                                    "haji selama 9 bulan pada tanggal 1 Desember 1938. Kapal ini menjadi salah satu peristiwa penting dalam sejarah " +
                                    "Makassar karena merupakan kapal uap terbesar pada zamannya1. Dalam perjalanan ini, tokoh utama Daeng Andipati, " +
                                    "seorang pengusaha dari Makassar, melakukan perjalanan bersama istri dan dua anaknya, Elsa dan Anna. Selain itu, ada " +
                                    "tokoh lain seperti Ambo Uleng, mantan pelaut yang berusaha melupakan masa lalunya, dan Gurutta Ahmad Karaeng, seorang ulama " +
                                    "yang membantu mengajari anak-anak di kapal..\n"
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
private fun DetailRinduPreview() {
    DetailRindu(navController = rememberNavController())
}