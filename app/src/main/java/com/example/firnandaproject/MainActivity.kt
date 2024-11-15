package com.example.firnandaproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.firnandaproject.Firnanda.MainScreen
import com.example.firnandaproject.ui.theme.FirnandaprojectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirnandaprojectTheme  {
                MainScreen()
            }
        }
    }
}
