package com.example.appnytivitchoem

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)

        val btnFace = findViewById<Button>(R.id.btnFace)
        val btnTruong = findViewById<Button>(R.id.btnTruong)
        val btnSdt = findViewById<Button>(R.id.btnSdt)
        val btnNy = findViewById<Button>(R.id.btnNy)
        val btnHelp = findViewById<Button>(R.id.btnHelp)

        btnFace.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/phoenix.khai.528"))
            startActivity(i)
        }

        btnTruong.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://hust.edu.vn"))
            startActivity(i)
        }

        btnSdt.setOnClickListener{
            val i = Intent(this,sdt::class.java)
            startActivity(i)
        }

        btnNy.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ngtrlngoc"))
            startActivity(i)
        }

        btnHelp.setOnClickListener{
            val i = Intent(this,viec::class.java)
            startActivity(i)
        }
    }
}