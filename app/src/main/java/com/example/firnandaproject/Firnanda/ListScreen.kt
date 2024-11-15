package com.example.firnandaproject.Firnanda

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.firnandaproject.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListScreen(navController: NavHostController) {
    val rowImages = listOf(
        R.drawable.alamanda,
        R.drawable.airmancur,
        R.drawable.pancawarna,
        R.drawable.anggrekbulan,
        R.drawable.anggrek,
        R.drawable.ashter,
        R.drawable.asoka,
        R.drawable.begonia,
        R.drawable.bugenvil,
        R.drawable.calendula
    )

    val columnImages = listOf(
        R.drawable.dahlia,
        R.drawable.daisy,
        R.drawable.geranium,
        R.drawable.kamboja,
        R.drawable.kancing,
        R.drawable.kemuning,
        R.drawable.latulip,
        R.drawable.lilac,
        R.drawable.lily,
        R.drawable.matahari
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        CenterAlignedTopAppBar(
            title = { Text("Home Screen") },
            colors = TopAppBarDefaults.smallTopAppBarColors(
                containerColor = Color(0xFF6200EE),
                titleContentColor = Color.White
            )
        )
        Spacer(modifier = Modifier.height(8.dp))

        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(horizontal = 8.dp)
        ) {
            items(rowImages.size) { index ->
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(4.dp)
                ) {
                    ImageItem(
                        image = painterResource(id = rowImages[index]),
                        description = "Image $index",
                        onClick = { navController.navigate("detail/$index") }
                    )
                    Text(text = "Bunga $index")
                }
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(vertical = 8.dp)
        ) {
            items(columnImages.size) { index ->
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(4.dp)
                ) {
                    ImageItem(
                        image = painterResource(id = columnImages[index]),
                        description = "Image $index",
                        onClick = { navController.navigate("detail/$index") }
                    )
                    Text(text = "Bunga $index")
                }
            }
        }
    }
}

@Composable
fun ImageItem(
    image: Painter,
    description: String,
    onClick: () -> Unit
) {
    Image(
        painter = image,
        contentDescription = description,
        modifier = Modifier
            .size(150.dp)
            .padding(0.dp)
            .clickable { onClick() }
    )
}
