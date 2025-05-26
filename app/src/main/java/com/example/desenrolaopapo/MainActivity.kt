package com.example.desenrolaopapo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.desenrolaopapo.ui.theme.DesenrolaOPapoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesenrolaOPapoTheme {
                val navController = rememberNavController()
                Navegacao(navController = navController)
            }
        }
    }
}