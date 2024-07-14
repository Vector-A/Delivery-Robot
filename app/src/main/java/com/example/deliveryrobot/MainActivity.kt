package com.example.deliveryrobot

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var handler: Handler? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        handler = Handler()
        handler!!.postDelayed({
            val i = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(i)
            finish()
        }, 5000)
    }
}