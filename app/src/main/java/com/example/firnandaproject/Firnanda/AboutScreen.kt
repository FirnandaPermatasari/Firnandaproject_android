package com.example.firnandaproject.Firnanda

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firnandaproject.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)

    ) {
        CenterAlignedTopAppBar(
            title = { Text("About Me") },
            colors = TopAppBarDefaults.smallTopAppBarColors(
                containerColor = Color(0xFF6200EE),
                titleContentColor = Color.White
            )
        )
        Image(
            painter = painterResource(id = R.drawable.firnanda),
            contentDescription = "Profil",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(300.dp)
                .padding(bottom = 16.dp)
        )
        Text(
            text = "Nama: Firnanda Permatasari",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Email: fiernandapermatasari@gmail.com",
            fontSize = 16.sp,
        )
        Text(
            text = "Asal Perguruan Tinggi: Universitas Qomaruddin",
            fontSize = 16.sp,
        )
        Text(
            text = "Jurusan: Teknik Informatika",
            fontSize = 16.sp,
        )
    }
}
