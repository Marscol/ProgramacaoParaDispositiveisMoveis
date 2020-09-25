package com.example.prova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela1.*

class TelUmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela1)

        button.setOnClickListener() {
            mudarParaActivity()
        }
    }

    private fun mudarParaActivity() {
        val intent = Intent(this, TelDosActivity::class.java)
        startActivity(intent)
    }

}