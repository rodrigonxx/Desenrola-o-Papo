package com.example.desenrolaopapo.ui.theme


import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MeuBotao (
    texto: String, //texto que vai aparecer no botão
    onClick: () -> Unit, //ação que vai acontecer quando clicar no botão
    modifier: Modifier = Modifier //modificador para o botão
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .width(400.dp) // largura do botão
            .height(80.dp), // altura do botão
        // shape = RoundedCornerShape(20.dp), // cantos arredondados do botão
        colors = ButtonDefaults.buttonColors(containerColor = roxomeianoite) // cor do fundo do botão
        //containerColor define a cor de fundo do botão
    ) {

        Text(
            text = texto, // texto que vai aparecer no botão
            fontSize = 20.sp, // tamanho da fonte do texto
            color = Color.White, // cor do texto (termo utilizado quando a cor ja e padrao do android)
            fontFamily = poppinsBlack // fonte do texto
        )
    }
}