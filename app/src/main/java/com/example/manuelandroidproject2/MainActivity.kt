package com.example.manuelandroidproject2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
      //Declaring variable
    lateinit var info :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          //Button 1
            info = findViewById(R.id.btn2)

            info.setOnClickListener {
                Toast.makeText(applicationContext, "Entering Next Page", Toast.LENGTH_LONG).show()
                var myinfo = Intent(this,FormActivity::class.java)
                startActivity(myinfo)
            }
        }
    }

