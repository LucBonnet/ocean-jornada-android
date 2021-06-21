package com.oceanbrasil.ocean_android_introducao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* val -> imutavel */
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val btEnter = findViewById<Button>(R.id.btEnter)
        val etName = findViewById<EditText>(R.id.etName)

        btEnter.setOnClickListener {
            tvResult.text = etName.text.toString()
        }


    }
}