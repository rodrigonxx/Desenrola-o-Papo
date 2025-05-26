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
fun MeuBotao(
    texto: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .width(400.dp)
            .height(80.dp),
        colors = ButtonDefaults.buttonColors(containerColor = roxomeianoite)

    ) {

        Text(
            text = texto,
            fontSize = 20.sp,
            color = Color.White,
            fontFamily = poppinsBlack
        )
    }
}