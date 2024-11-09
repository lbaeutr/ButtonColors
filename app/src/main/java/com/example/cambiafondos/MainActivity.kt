package com.example.cambiafondos

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val mainLayout = findViewById<View>(R.id.main)
        val cambiarColorBoton = findViewById<Button>(R.id.button)

        // Crea una lista de recursos de colores del arcoíris
        val colors = listOf(
            R.color.rojo,
            R.color.naranja,
            R.color.amarillo,
            R.color.verde,
            R.color.azul,
            R.color.indigo,
            R.color.violeta
        )

        // Inicializa el índice en 0
        var colorIndex = 0

        cambiarColorBoton.setOnClickListener {
            // Cambia el color de fondo usando el siguiente color de la lista
            mainLayout.setBackgroundColor(ContextCompat.getColor(this, colors[colorIndex]))

            // Incrementa el índice y reinícialo si llega al final de la lista
            colorIndex = (colorIndex + 1) % colors.size
        }
    }
}
