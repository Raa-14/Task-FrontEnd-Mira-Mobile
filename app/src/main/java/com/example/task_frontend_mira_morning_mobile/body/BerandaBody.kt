package com.example.task_frontend_mira_morning_mobile.body
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.task_frontend_mira_morning_mobile.R


@Composable
fun BerandaBodyScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF4ECD8))
    ) {
        // Spacer awal
        Spacer(modifier = Modifier.height(16.dp))

        // TextField Pencarian
        var searchQuery by remember { mutableStateOf("") }

        TextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            label = { Text("Search") },
            placeholder = { Text("Enter search term") },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = "Search Icon")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .shadow(6.dp, shape = RoundedCornerShape(50.dp))
                .background(Color.White, CircleShape),
            singleLine = true,
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Row untuk Cards
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Card 1 - Sudah Dibaca
            Card(
                modifier = Modifier
                    .padding(4.dp)
                    .shadow(
                        elevation = 12.dp,
                        ambientColor = Color.Black.copy(alpha = 0.2f),
                        spotColor = Color.Black.copy(alpha = 0.5f)
                    ),
                onClick = { /* Handle onClick */ },
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
            ) {
                Box(
                    modifier = Modifier
                        .padding(16.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painter = painterResource(id = R.drawable.img_1),
                                contentDescription = "Sudah Dibaca",
                                modifier = Modifier
                                    .size(24.dp)
                                    .padding(end = 6.dp)
                            )
                            Text(
                                text = "Sudah Dibaca",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(bottom = 8.dp)
                            )
                        }
                        Text(
                            text = "5",
                            fontSize = 26.sp,
                            color = Color.Black
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.width(16.dp))

            // Card 2 - Favorit
            Card(
                modifier = Modifier
                    .padding(4.dp)
                    .shadow(
                        elevation = 12.dp,
                        ambientColor = Color.Black.copy(alpha = 0.2f),
                        spotColor = Color.Black.copy(alpha = 0.5f)
                    ),
                onClick = { /* Handle onClick */ },
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
            ) {
                Box(
                    modifier = Modifier
                        .padding(16.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Row{
                            Image(
                                painter = painterResource(id = R.drawable.img_2),
                                contentDescription = "Favorit",
                                modifier = Modifier
                                    .size(24.dp)
                                    .padding(end = 6.dp)
                            )
                            Text(
                                text = "Favorit",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(bottom = 8.dp)

                            )
                        }
                        Text(
                            text = "3",
                            fontSize = 26.sp,
                            color = Color.Black
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Bagian Rekomendasi Buku
        Text(
            text = "Rekomendasi Buku",
            fontSize = 23.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 20.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Grid untuk Buku
        val imageList = listOf(
            R.drawable.hujan,
            R.drawable.dilan,
            R.drawable.laskarpelangi,
            R.drawable.pulang,
            R.drawable.mahatma,
            R.drawable.filosofiteras
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(imageList) { imageRes ->
                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(1f)
                        .clip(RoundedCornerShape(8.dp))
                        .shadow(4.dp)
                )
            }
        }
    }
}


        // Column Penutup





@Preview
@Composable
private fun BerandaBodyPreview() {
    BerandaBodyScreen(navController = rememberNavController())
}

