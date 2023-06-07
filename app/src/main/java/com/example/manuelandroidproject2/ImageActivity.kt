package com.example.manuelandroidproject2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ImageActivity : AppCompatActivity() {
    lateinit var pacino:ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        pacino = findViewById(R.id.Image1)
        pacino.setOnClickListener {
            val mike=Intent(this, StoreActivity::class.java)
            startActivity(mike)
        }
    }
}
