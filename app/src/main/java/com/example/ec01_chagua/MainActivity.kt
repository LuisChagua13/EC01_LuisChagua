package com.example.ec01_chagua

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ec01_chagua.ui.theme.EC01_ChaguaTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EC01_ChaguaTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Ejercicio1.Companion.MostrarResultadoEstacionamiento(horas = 3, minutos = 30)
                        Ejercicio2.Companion.MostrarResultadoPromedio(nota1 = 15.0, nota2 = 18.0, nota3 = 20.0, nota4 = 17.0)
                        Ejercicio3.Companion.MostrarResultadoDNI(anioNacimiento = 2000)
                        Ejercicio4.Companion.MostrarNumerosPares()
                    }
                }
            }
        }
    }
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
private fun GreetingPreview() {
    EC01_ChaguaTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Ejercicio1.Companion.MostrarResultadoEstacionamiento(horas = 3, minutos = 30)
                Ejercicio2.Companion.MostrarResultadoPromedio(nota1 = 15.0, nota2 = 18.0, nota3 = 20.0, nota4 = 17.0)
                Ejercicio3.Companion.MostrarResultadoDNI(anioNacimiento = 2000)
                Ejercicio4.Companion.MostrarNumerosPares()
            }
        }
    }
}

