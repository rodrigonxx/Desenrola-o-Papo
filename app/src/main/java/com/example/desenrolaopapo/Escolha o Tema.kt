package com.example.desenrolaopapo

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.desenrolaopapo.ui.theme.MeuBotao
import com.example.desenrolaopapo.ui.theme.poppinsBlack
import com.example.desenrolaopapo.ui.theme.roxomeianoite


@SuppressLint("ResourceAsColor")
@Composable
fun Escolhaotema() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) { //chave para englobar tudo que tem na coluna

        Image(
            painter = painterResource(R.drawable.desenrola_o_papo),
            contentDescription = "Logo do aplicativo, uma caixa de fala escrito\"Desenrola o Papo\"",
        )

        Spacer( modifier = Modifier.padding(5.dp))

        Text(
            text = "Escolha um tema",
            fontFamily = poppinsBlack,
            fontSize = 32.sp,
            color = roxomeianoite // termo utilizado para definir a cor do texto quando se declara como variavel
        )

        Spacer( modifier = Modifier.padding(25.dp)) //espaco entre os botoes

        MeuBotao(
            texto = "Primeiro Encontro",
            onClick = { /*TODO*/ },


        )

        Spacer( modifier = Modifier.padding(30.dp))

        MeuBotao(
            texto = "Para redes sociais",
            onClick = { /*TODO*/ },


        )

        Spacer( modifier = Modifier.padding(30.dp))

        MeuBotao(
            texto = "Fazer amizade",
            onClick = { /*TODO*/ },

        )

        Spacer( modifier = Modifier.padding(30.dp))

        MeuBotao(
            texto = "Para conhecer melhor",
            onClick = { /*TODO*/ },

            )
        Spacer( modifier = Modifier.padding(30.dp))


    }
}



















