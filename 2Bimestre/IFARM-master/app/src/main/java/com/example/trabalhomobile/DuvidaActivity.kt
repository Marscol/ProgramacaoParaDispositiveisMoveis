package com.example.trabalhomobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_duvida.*

class DuvidaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_duvida)

        button.setOnClickListener(){
            intent = Intent(this, TerceiraTela::class.java)
            startActivity(intent)
        }
    }
}