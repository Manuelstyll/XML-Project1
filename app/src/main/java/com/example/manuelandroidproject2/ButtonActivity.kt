package com.example.manuelandroidproject2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ButtonActivity : AppCompatActivity() {
    lateinit var intent: Button
    lateinit var submit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        submit = findViewById(R.id.btn4)
        intent = findViewById(R.id.btn5)

        intent.setOnClickListener {
            Toast.makeText(applicationContext, "Entering Next Page", Toast.LENGTH_LONG).show()
            var myintent = Intent(this, IntentActivity::class.java)
            startActivity(myintent)
        }

        submit.setOnClickListener {
            Toast.makeText(applicationContext, "Report has been submitted", Toast.LENGTH_LONG).show()
        }
    }
}