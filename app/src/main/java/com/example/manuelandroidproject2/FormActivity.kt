package com.example.manuelandroidproject2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class FormActivity : AppCompatActivity() {

    //Declare Variable
    lateinit var feedback: Button
    lateinit var pay: Button
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        pay = findViewById(R.id.Pay)
        feedback = findViewById(R.id.btn3)

        pay.setOnClickListener {
            val simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }
        feedback.setOnClickListener {
            Toast.makeText(applicationContext, "Entering Next Page", Toast.LENGTH_LONG).show()
            var myfeedback = Intent(this,ButtonActivity::class.java)
            startActivity(myfeedback)
        }
    }
}
