package com.example.prova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela2.*

class TelDosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        buttonNext.setOnClickListener() {
            val intent = Intent(this, EsperaActivity::class.java)
            startActivity(intent)
        }

        buttonPreview.setOnClickListener() {
            val intent = Intent(this, TelUmActivity::class.java)
            startActivity(intent)
        }
    }
}