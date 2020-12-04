package com.example.trabalhomobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_duvida.button

class TerceiraTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terceira_tela)

        button.setOnClickListener(){
            intent = Intent(this, TelaLogin::class.java)
            startActivity(intent)
        }
    }
}