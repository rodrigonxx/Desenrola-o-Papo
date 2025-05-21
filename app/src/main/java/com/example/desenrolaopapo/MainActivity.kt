package com.example.desenrolaopapo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.desenrolaopapo.ui.theme.DesenrolaOPapoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val splashScreen = installSplashScreen() // SplashScreen
        setContent {
            DesenrolaOPapoTheme {
                App()
                }
            }
        }
    }

@Composable
fun App() {
    Escolhaotema()
}



@Preview(showBackground = true)
@Composable
fun AppPreview() {
    Escolhaotema()
    }