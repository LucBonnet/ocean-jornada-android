package com.oceanbrasil.ocean_android_introducao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_INFO = "EXTRA_INFO"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* val -> imutavel */
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val btEnter = findViewById<Button>(R.id.btEnter)
        val btClear = findViewById<Button>(R.id.btClear)
        val btNewScreen = findViewById<Button>(R.id.btNewScreen)
        val etName = findViewById<EditText>(R.id.etName)
        val etLastName = findViewById<EditText>(R.id.etLastName)

        btEnter.setOnClickListener {
            var name = etName.text.toString()
            var lastName = etLastName.text.toString()

            tvResult.text = name + " " + lastName
        }

        btClear.setOnClickListener {
            tvResult.setText(R.string.resul)
            etName.setText("")
            //etName.text.clear()
            etLastName.setText("")
        }

        btNewScreen.setOnClickListener {
            val newScreenIntent = Intent(this, SecondActivity::class.java)
            newScreenIntent.putExtra(EXTRA_INFO, etName.text.toString())
            startActivity(newScreenIntent)
        }
    }
}