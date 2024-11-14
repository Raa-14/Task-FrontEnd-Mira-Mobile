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
fun DetailSalamTerakhir(navController: NavController) {
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
                    painter = painterResource(id = R.drawable.salamterakhir),
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
                        append("Salam Terakhir\n")

                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) { append("Penulis: ") }
                        append("Dr. Mohamed Zulkifli Al-Bakri\n")

                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) { append("Tahun Terbit: ") }
                        append("2022\n")

                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) { append("Penerbit: ") }
                        append("Pustaka Cahaya Kasturi Sdn Bhd\n")

                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) { append("Sinopsis: ") }
                        append(
                            "Novel ini menghimpunkan nasihat-nasihat dari seorang bapa kepada anaknya. Dr. Mohamed Zulkifli Al-Bakri, " +
                                    "yang merupakan seorang tokoh ulama dan ahli syariah, menuliskan berbagai saran dan nasihat yang dia " +
                                    "terkumpulkan selama hidupnya. Bahkan di tengah-tengah proses penulisan buku ini, Dr. Zulkifli mengalami " +
                                    "pemergian anaknya yang sangat dicintainya, namun ia tidak mematikan semangatnya untuk menyelesaikan buku ini.\n"
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
private fun DetailSalamTerakhirPreview() {
    DetailSalamTerakhir(navController = rememberNavController())
}