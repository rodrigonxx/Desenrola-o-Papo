package com.example.desenrolaopapo

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavType
import androidx.navigation.navArgument

@Composable
fun Navegacao(navController: NavHostController) { // 'navController' é o nosso "controle remoto do GPS"
    NavHost(navController = navController, startDestination = "escolha") { // Diz que a casa sempre começa na "rua escolha"

        // RUA 1: SALA DE ESCOLHA DE TEMAS
        // Nome da rua: "escolha"
        // Quem mora aqui: A tela 'Escolhaotema'
        composable("escolha") {
            // A gente passa o "controle remoto do GPS" (navController) para a Escolhaotema,
            // assim ela pode chamar o GPS depois.
            Escolhaotema(navController)
        }

        // RUA 2: QUARTO DE PERGUNTAS (NOSSO QUARTO MÁGICO!)
        // Nome da rua: "perguntas/{titulo}/{tipoTema}"
        // As chaves `{}` significam que vamos levar "malinhas" de informação nessa rua.
        // {titulo} = A malinha com o nome do tema que vai aparecer grande na tela (ex: "Primeiro Encontro")
        // {tipoTema} = A malinha com um código secreto que a tela vai usar para saber QUAL lista de perguntas pegar (ex: "primeiroEncontro")
        composable(
            route = "perguntas/{titulo}/{tipoTema}", // O nome da rua e o que ela espera nas malinhas
            arguments = listOf( // Aqui a gente define o que cada malinha tem:
                navArgument("titulo") { type = NavType.StringType }, // Malinha 'titulo' é um texto (String)
                navArgument("tipoTema") { type = NavType.StringType } // Malinha 'tipoTema' também é um texto
            )
        ) { backStackEntry -> // 'backStackEntry' é tipo o "recibo da viagem", onde estão as malinhas

            // A gente "abre" as malinhas e pega as informações:
            val titulo = backStackEntry.arguments?.getString("titulo") // Pega o texto da malinha 'titulo'
            val tipoTema = backStackEntry.arguments?.getString("tipoTema") // Pega o texto da malinha 'tipoTema'

            // AGORA VEM A MÁGICA REAL: A gente decide qual LISTA de perguntas usar!
            // A gente olha o 'tipoTema' que veio na malinha e escolhe a lista certa do seu arquivo 'Perguntas.kt'
            val perguntasParaExibir = when (tipoTema) {
                "primeiroEncontro" -> primeiroEncontro // Se o código for "primeiroEncontro", pega a lista 'primeiroEncontro'
                "redesSociais" -> redesSociais       // Se o código for "redesSociais", pega a lista 'redesSociais'
                "fazerAmizade" -> fazerAmizade
                "conhecerMelhor" -> conhecerMelhor
                else -> emptyList() // Se vier um código desconhecido, manda uma lista vazia pra não dar problema
            }

            // POR FIM: Se a gente tem um título e encontrou perguntas, a gente manda o carro para o "Quarto de Perguntas"!
            if (titulo != null && perguntasParaExibir.isNotEmpty()) {
                // E a gente "entrega" para o Quarto de Perguntas o título, a lista de perguntas E o controle remoto do GPS!
                ExibirPerguntas(titulo = titulo, perguntas = perguntasParaExibir, navController = navController)
            }
        }
    }
}