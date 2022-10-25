package com.example.internfactory

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Forgot_password_page : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password_page)

        val send_btn = findViewById<Button>(R.id.otp_btn)
        send_btn.setOnClickListener {
            val Intent = Intent(this,verification_page::class.java)
            startActivity(Intent)
        }

    }
}