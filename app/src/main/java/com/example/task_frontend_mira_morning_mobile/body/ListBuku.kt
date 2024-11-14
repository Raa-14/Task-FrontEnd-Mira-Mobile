import android.content.ClipData.Item
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun ListBuku(navController: NavController) {
    var selectedCategory by remember { mutableStateOf("Fiksi") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF4ECD8))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 20.dp),
            horizontalAlignment = Alignment.Start
        ) {
            // Teks
            Text(
                text = "Kategori Buku",
                color = Color.Gray,
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                // Items kategori buku
                item {
                    Text(
                        text = "Fiksi",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .background(
                                if (selectedCategory == "Fiksi") Color(0xFFBC8A4D) else Color(0xFFD4A373),
                                RoundedCornerShape(12.dp)
                            )
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                            .clickable {
                                selectedCategory = "Fiksi"
                            }
                    )
                }
                item {
                    Text(
                        text = "NonFiksi",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .background(
                                if (selectedCategory == "NonFiksi") Color(0xFFBC8A4D) else Color(0xFFD4A373),
                                RoundedCornerShape(12.dp)
                            )
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                            .clickable {
                                selectedCategory = "NonFiksi"
                            }
                    )
                }
                item {
                    Text(
                        text = "Kesehatan",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .background(
                                if (selectedCategory == "Kesehatan") Color(0xFFBC8A4D) else Color(0xFFD4A373),
                                RoundedCornerShape(12.dp)
                            )
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                            .clickable {
                                selectedCategory = "Kesehatan"
                            }
                    )
                }
                item {
                    Text(
                        text = "Komik",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .background(
                                if (selectedCategory == "Komik") Color(0xFFBC8A4D) else Color(0xFFD4A373),
                                RoundedCornerShape(12.dp)
                            )
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                            .clickable {
                                selectedCategory = "Komik"
                            }
                    )
                }
            }
        }


        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            item {

                Text(
                    text = "Daftar Buku",
                    color = Color.Gray,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
            }

            val books = when (selectedCategory) {
                "Fiksi" -> listOf(
                    "Imperfect",
                    "Pergi",
                    "Cahaya Hutan",
                    "Dhirga",
                    "Puisi Cinta",
                    "Hell House",
                    "Salam Terakhir",
                    "Those Eyes",
                    "Pulang",
                    "Rindu"
                )
                "NonFiksi" -> listOf(
                    "Kartini, Kisah Hidup Seorang Inspiratif",
                    "Sapiens, A Brief History of Humankind",
                    "Soeharto, The Life and Legacy of Indonesia’s Second President",
                    "Jiwa Seorang Negarawan, Biografi Tun Azizan Zainul Abidin",
                    "Long Walk to Freedom",
                    "Kamus Lengkap Inggris-Indonesia",
                    "Pengantar Ilmu Hukum",
                    "Pendidikan yang Memanusiakan",
                    "Biografi Politik Habibie",
                    "Biografi Umar Ibn Abdul Aziz"
                )
                "Kesehatan" -> listOf(
                    "Counsels on Health",
                    "Deep Nutrition: Why Your Genes Need Traditional Food",
                    "This Is Depression: A Comprehensive, Compassionate Guide for Anyone Who Wants to Understand Depression",
                    "Total Health: Choices for a Winning Lifestyle",
                    "20 Holistic Health Books for 2022",
                    "Tentang Tubuhmu",
                    "Berani Langsing Mulai Sekarang!",
                    "Keajaiban Air Mineral Bagi Kesehatan",
                    "Merawat dan Menjaga Kesehatan Gigi dan Mulut",
                    "The power Of Yoga"
                )
                "Komik" -> listOf(
                    "Space Dumplins",
                    "Si Juki Seri Keroyokan",
                    "Panglima Islam Pemberani",
                    "Next G: Angkot Tua",
                    "Top Secret Santri Gontor",
                    "Si Unis",
                    "Kemala vol.1",
                    "Death Note Short Stories",
                    "Shaman King Complete Edition 03",
                    "Detektif Conan 100"
                )
                else -> emptyList()
            }

            items(books) { book ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Text(
                        text = book,
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    )
                }
            }
        }
    }
}


@Preview
@Composable
private fun ListBukuPreview() {
    ListBuku(navController = rememberNavController())
}

