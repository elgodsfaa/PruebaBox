package com.godsfa.composeprueba2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.godsfa.composeprueba2.ui.theme.ComposePrueba2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
          PruebaBox()
        }
    }
}

@Composable
fun PruebaBox() {
   Box(modifier = Modifier.fillMaxSize().padding(50.dp)) {
        Text(text = "Hola, mundo!"
            , modifier = Modifier.align(Alignment.TopStart))
        Text(text = "Este es un texto dentro del Box."
            , modifier = Modifier.align(Alignment.Center))
        Text(text = "Otro texto dentro del Box."
            , modifier = Modifier.align(Alignment.BottomEnd))

    }
}


@Composable
@Preview (showBackground = true)
fun PruebaBoxPreview() {
    PruebaBox()
}
