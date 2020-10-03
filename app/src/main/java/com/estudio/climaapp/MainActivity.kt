package com.estudio.climaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var tvCiudad: TextView? = null
    var tvGrados: TextView? = null
    var tvEstado: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCiudad = findViewById(R.id.txtCiudad)
        tvGrados = findViewById(R.id.txtGrados)
        tvEstado = findViewById(R.id.txtEstado)

        val ciudadData = intent.getStringExtra("com.estudio.climaapp.ActivityMenu.CIUDAD")
        Toast.makeText(this, ciudadData, Toast.LENGTH_SHORT).show()

        val ciudadIntibuca = Ciudad("Intibucá", 8,"Frio Frio como el corazón de tu ex")
        val ciudadLaEza = Ciudad("La Esperanza", 15,"Parcialmente soleado")
        val ciudadCamasca = Ciudad("Camasca", 35,"Parece el Sahara")

        if(ciudadData == "Ciudad: Intibucá"){
            tvCiudad?.text = ciudadIntibuca.nombre
            tvGrados?.text = ciudadIntibuca.grados.toString() + "°"
            tvEstado?.text = ciudadIntibuca.estado
        } else if (ciudadData == "Ciudad: La Esperanza"){
            tvCiudad?.text = ciudadLaEza.nombre
            tvGrados?.text = ciudadLaEza.grados.toString() + "°"
            tvEstado?.text = ciudadLaEza.estado
        } else if (ciudadData == "Ciudad: Camasca"){
            tvCiudad?.text = ciudadCamasca.nombre
            tvGrados?.text = ciudadCamasca.grados.toString() + "°"
            tvEstado?.text = ciudadCamasca.estado
        }

    }
}