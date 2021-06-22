package com.oceanbrasil.ocean_android_introducao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btBack = findViewById<Button>(R.id.btBack)
        val tvMsg = findViewById<TextView>(R.id.tvMsg)

        tvMsg.text = intent.getStringExtra(MainActivity.EXTRA_INFO)

        btBack.setOnClickListener {
            val backIntent = Intent(this, MainActivity::class.java)
            startActivity(backIntent)
        }
    }
}