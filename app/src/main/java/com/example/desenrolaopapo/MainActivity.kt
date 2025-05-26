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
            DesenrolaOPapoTheme { // Seu tema
                // Aqui a gente "liga" o GPS e guarda ele numa variável
                val navController = rememberNavController()

                // E aqui a gente fala para o aplicativo: "Use este mapa de navegação!"
                Navegacao(navController = navController)
            }
        }
    }
}