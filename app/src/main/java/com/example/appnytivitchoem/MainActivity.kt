package com.example.appnytivitchoem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var edtPassWord: EditText
    private lateinit var btnXacThuc: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtPassWord = findViewById(R.id.edtPassWord)
        btnXacThuc = findViewById(R.id.btnXacThuc)

        btnXacThuc.setOnClickListener {
            val password = edtPassWord.text.toString().trim()

            // Kiểm tra xem mật khẩu có đúng không
            if (password == "Emyeuanh") {
                // Nếu đúng, chuyển sang trang mới (app)
                val intent = Intent(this@MainActivity, AppActivity::class.java)
                startActivity(intent)
                finish() // Kết thúc activity hiện tại
            } else {
                // Nếu sai, hiển thị thông báo
                Toast.makeText(this@MainActivity, "Nhóc con nhập sai pass r =))", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
