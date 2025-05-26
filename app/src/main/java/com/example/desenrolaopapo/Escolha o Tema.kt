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
import androidx.navigation.NavHostController
import com.example.desenrolaopapo.ui.theme.MeuBotao
import com.example.desenrolaopapo.ui.theme.poppinsBlack
import com.example.desenrolaopapo.ui.theme.roxomeianoite


@SuppressLint("ResourceAsColor")
@Composable
fun Escolhaotema(navController: NavHostController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(R.drawable.desenrola_o_papo),
            contentDescription = "Logo do aplicativo, uma caixa de fala escrito\"Desenrola o Papo\"",
        )

        Spacer(modifier = Modifier.padding(5.dp))

        Text(
            text = "Escolha um tema",
            fontFamily = poppinsBlack,
            fontSize = 32.sp,
            color = roxomeianoite
        )

        Spacer(modifier = Modifier.padding(25.dp))

        MeuBotao(
            texto = "PRIMEIRO ENCONTRO",
            onClick = { navController.navigate("perguntas/Primeiro Encontro/primeiroEncontro") },


            )

        Spacer(modifier = Modifier.padding(30.dp))

        MeuBotao(
            texto = "REDES SOCIAIS",
            onClick = { navController.navigate("perguntas/Redes Sociais/redesSociais") },


            )

        Spacer(modifier = Modifier.padding(30.dp))

        MeuBotao(
            texto = "FAZER AMIZADE",
            onClick = { navController.navigate("perguntas/Fazer Amizade/fazerAmizade") },

            )

        Spacer(modifier = Modifier.padding(30.dp))

        MeuBotao(
            texto = "CONHECER MELHOR",
            onClick = { navController.navigate("perguntas/Conhecer Melhor/conhecerMelhor") },

            )
        Spacer(modifier = Modifier.padding(30.dp))


    }
}



















