package com.example.trabalhomobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_duvida.*

class TelaLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_login)

        val botaoEntrar = findViewById<Button>(R.id.buttonentrar)

        botaoEntrar.setOnClickListener(){
            intent = Intent(this, MinhaDuvida::class.java)
            startActivity(intent)
        }
    }
}