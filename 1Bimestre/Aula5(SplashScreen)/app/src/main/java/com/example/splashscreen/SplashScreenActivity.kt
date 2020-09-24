package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //      window.requestFeature(Window.FEATURE_NO_TITLE)
        //      window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN )
        setContentView(R.layout.activity_splash_sceen)

        mudarParaActivityTela2()

    }

    private fun mudarParaActivityTela2() {
        val intent = Intent(packageContext: this, Tela2Activity::class.java)

        Handler().postDelayed({
            intent.change()
        }, 5 * 1000)
    }

    fun Intent.change(){
        startActivity(intent: this)
        finish()
    }


}