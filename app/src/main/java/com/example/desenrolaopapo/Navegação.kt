package com.example.desenrolaopapo

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavType
import androidx.navigation.navArgument

@Composable
fun Navegacao(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "escolha") {


        composable("escolha") {

            Escolhaotema(navController)
        }

        composable(
            route = "perguntas/{titulo}/{tipoTema}",
            arguments = listOf(
                navArgument("titulo") { type = NavType.StringType },
                navArgument("tipoTema") { type = NavType.StringType }
            )
        ) { backStackEntry ->


            val titulo = backStackEntry.arguments?.getString("titulo")
            val tipoTema = backStackEntry.arguments?.getString("tipoTema")


            val perguntasParaExibir = when (tipoTema) {
                "primeiroEncontro" -> primeiroEncontro
                "redesSociais" -> redesSociais
                "fazerAmizade" -> fazerAmizade
                "conhecerMelhor" -> conhecerMelhor
                else -> emptyList()
            }


            if (titulo != null && perguntasParaExibir.isNotEmpty()) {
                ExibirPerguntas(
                    titulo = titulo,
                    perguntas = perguntasParaExibir,
                    navController = navController
                )
            }
        }
    }
}