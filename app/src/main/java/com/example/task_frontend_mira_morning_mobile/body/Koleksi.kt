package com.example.task_frontend_mira_morning_mobile.body
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.task_frontend_mira_morning_mobile.R

@Composable
fun Koleksi(navController: NavController) {

    // Daftar gambar
    val imageList = listOf(
        R.drawable.hujan,
        R.drawable.dilan,
        R.drawable.laskarpelangi,
        R.drawable.pulang,
        R.drawable.mahatma,
        R.drawable.filosofiteras,
        R.drawable.pergi,
        R.drawable.imperfect,
        R.drawable.puisicinta,
        R.drawable.thoseeyes
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF4ECD8))
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(imageList) { imageRes ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(8.dp)
            ) {

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


                Spacer(modifier = Modifier.height(8.dp))


                IconButton(onClick = { /* Handle icon click */ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "Favorite Icon",
                        tint = Color.Red
                    )
                }
            }
        }
    }
}



@Preview
@Composable
private fun KoleksiPreview() {
    Koleksi(navController = rememberNavController())
}