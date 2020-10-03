package com.estudio.climaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class ActivityMenu : AppCompatActivity() {
    val Tag = "com.estudio.climaapp.ActivityMenu.CIUDAD"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnIntibuca = findViewById<Button>(R.id.btnIntibuca)
        val btnLaEza = findViewById<Button>(R.id.btnLaEza)
        val btnCamasca = findViewById<Button>(R.id.btnCamasca)

        btnIntibuca.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this,"Ciudad: Intibucá", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(Tag, "Ciudad: Intibucá")
            startActivity(intent)
        })
        btnLaEza.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this,"Ciudad: La Esperanza", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(Tag, "Ciudad: La Esperanza")
            startActivity(intent)
        })
        btnCamasca.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this,"Ciudad: Camasca", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(Tag, "Ciudad: Camasca")
            startActivity(intent)
        })
    }
}