package com.example.desenrolaopapo

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

        Text(
            text = "Escolha um tema",
            fontFamily = poppinsBlack,
            fontSize = 40.sp,
            color = (colorResource(id = R.color.roxomeianoite))
            //Maneira de colocar sua cor que declarou em colors.xml
        )

        Button(
            onClick = {  },
            modifier = Modifier.width(400.dp).height(70.dp),
            colors = ButtonDefaults.buttonColors(roxomeianoite) // serve para alterar cor do botão

        ) {
            Text(stringResource(R.string.botao1),fontSize = 25.sp
            )




        }
    }
}


















