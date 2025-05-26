package com.example.desenrolaopapo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons // Importa o ícone "Icons"
import androidx.compose.material.icons.filled.ArrowBack // Importa o ícone de seta para trás
import androidx.compose.material3.* // Importa componentes do Material Design 3 (como Scaffold, TopAppBar, IconButton)
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

@OptIn(ExperimentalMaterial3Api::class) // Anotação necessária para usar alguns recursos do Material3
@Composable
fun ExibirPerguntas(
    titulo: String,
    perguntas: List<String>,
    navController: NavHostController
) {
    var indiceperguntaAtual by remember { mutableStateOf(0) }
    val perguntaAtual = if (perguntas.isNotEmpty()) perguntas[indiceperguntaAtual] else "Nenhuma pergunta disponível."

    // O Scaffold é a estrutura básica de uma tela do Material Design.
    // Ele nos permite adicionar uma barra superior (TopAppBar), uma barra inferior, um botão flutuante, etc.
    Scaffold(
        topBar = {
            TopAppBar(
                title = {  },

                navigationIcon = { // Aqui configuramos o ícone de navegação (nossa seta de voltar)
                    IconButton(onClick = { navController.popBackStack() }) { // Ao clicar, ele volta!
                        Icon(
                            imageVector = Icons.Filled.ArrowBack, // O ícone de seta para trás
                            contentDescription = "Voltar"
                        )
                    }
                }
            )
        }
    ) { paddingValues -> // O conteúdo da tela precisa de um padding para não ficar por baixo da barra superior
        Column(
            // Aplica o padding vindo do Scaffold
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues), // Importante: aplique o padding aqui
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // O título do tema já está na TopAppBar, então podemos remover este Text daqui
            // Text(text = titulo, fontSize = 28.sp) // <-- REMOVER ESTE TEXTO
            Image(
                painter = painterResource(R.drawable.desenrola_o_papo),
                contentDescription = "Logo do aplicativo, uma caixa de fala escrito \"Desenrola o Papo\"",
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Text( // Mostra o TÍTULO do tema (que veio na malinha!)
                text = titulo,
                fontSize = 28.sp,
                modifier = Modifier.padding(horizontal = 16.dp),
                fontFamily = poppinsBlack,
                color = roxomeianoite
            )
            Spacer(modifier = Modifier.height(200.dp))

            Text( // Mostra a PERGUNTA ATUAL da lista (que veio na malinha!)
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
    ExibirPerguntas(titulo = "Exemplo de Tema", perguntas = exemploPerguntas, navController = previewNavController)
}