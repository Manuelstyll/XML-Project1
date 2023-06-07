package com.example.manuelandroidproject2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.Toast

class IntentActivity : AppCompatActivity() {
    lateinit var next:Button
    lateinit var sms:Button
    lateinit var email:Button
    lateinit var share:Button
    lateinit var camera:Button
    lateinit var call:Button
    lateinit var stk:Button
    lateinit var pay:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        next = findViewById(R.id.btn6)

        next.setOnClickListener {
            Toast.makeText(applicationContext, "Entering Next Page", Toast.LENGTH_LONG).show()
            var nextpage = Intent(this,ImageActivity::class.java)
            startActivity(nextpage)
        }
        

            //Finding View by id
        sms = findViewById(R.id.BtnSms)
        email = findViewById(R.id.BtnEmail)
        share = findViewById(R.id.BtnShare)
        camera = findViewById(R.id.BtnCamera)
        call = findViewById(R.id.BtnCall)
        stk = findViewById(R.id.BtnStk)
        pay = findViewById(R.id.btn7)

        //Intent
        //SMS
        sms.setOnClickListener {
            val uri = Uri.parse("smsto:0770450704")
            val intent = Intent(Intent.ACTION_SENDTO,uri)
            intent.putExtra("sms_body", "Hae glory...")
            startActivity(intent)
        }

        //Email
        email.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "relmvrelm@gmail.com", "null"))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "JOB APPLICATION")
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Dear Madam...")
            startActivity(Intent.createChooser(emailIntent, "Send email...."))
        }

        //Share
        share.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "https://github.com/Manuelstyll")
            startActivity(shareIntent)
        }

        //Camera
        camera.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePictureIntent, 1)

        }

        //STK
        stk.setOnClickListener {
            val simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }

        //Call
        call.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:"+"0770450704")
            startActivity(dialIntent)
        }

        //Pay page
        pay.setOnClickListener {
            val simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }

            pay.setOnClickListener {
                Toast.makeText(applicationContext, "Payment has been made", Toast.LENGTH_SHORT).show()
            }
        }
    }
}