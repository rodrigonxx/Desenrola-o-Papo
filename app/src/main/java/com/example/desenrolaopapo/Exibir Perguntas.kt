package com.example.desenrolaopapo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.desenrolaopapo.ui.theme.MeuBotao
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.desenrolaopapo.ui.theme.poppinsBlack
import com.example.desenrolaopapo.ui.theme.roxomeianoite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExibirPerguntas(
    titulo: String,
    perguntas: List<String>,
    navController: NavHostController
) {
    var indiceperguntaAtual by remember { mutableStateOf(0) }
    val perguntaAtual =
        if (perguntas.isNotEmpty()) perguntas[indiceperguntaAtual] else "Nenhuma pergunta disponível."

    Scaffold(
        topBar = {
            TopAppBar(
                title = { },

                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Voltar"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(R.drawable.desenrola_o_papo),
                contentDescription = "Logo do aplicativo, uma caixa de fala escrito \"Desenrola o Papo\"",
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Text(
                text = titulo,
                fontSize = 28.sp,
                modifier = Modifier.padding(horizontal = 16.dp),
                fontFamily = poppinsBlack,
                color = roxomeianoite
            )
            Spacer(modifier = Modifier.height(200.dp))

            Text(
                text = perguntaAtual,
                fontSize = 22.sp,
                modifier = Modifier.padding(horizontal = 13.dp),
                fontFamily = poppinsBlack,
                color = roxomeianoite
            )

            Spacer(modifier = Modifier.height(200.dp))

            MeuBotao(
                texto = "Próxima Pergunta",
                onClick = {
                    indiceperguntaAtual = (indiceperguntaAtual + 1) % perguntas.size


                }
            )
            Spacer(modifier = Modifier.height(100.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewExibirPerguntas() {
    val exemploPerguntas = listOf(
        "Qual é sua cor favorita?",
        "Qual seu filme preferido?",
        "Se você fosse um animal, qual seria?"
    )
    val previewNavController = rememberNavController()
    ExibirPerguntas(
        titulo = "Exemplo de Tema",
        perguntas = exemploPerguntas,
        navController = previewNavController
    )
}