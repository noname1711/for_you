package com.example.appnytivitchoem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class viec : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viec)
        val btnAnh = findViewById<Button>(R.id.btnAnh)

        btnAnh.setOnClickListener{
            val i = Intent(this,anh::class.java)
            startActivity(i)
        }
    }
}