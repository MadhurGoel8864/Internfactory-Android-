package com.example.internfactory

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class Home_page : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        val sign_in_activity_btn = findViewById<Button>(R.id.login_btn)
        val sign_up_activity_btn = findViewById<Button>(R.id.sign_up_btn)
        sign_in_activity_btn.setOnClickListener {
            val Intent = Intent(this, sign_in_page::class.java)
            startActivity(Intent)
        }
        sign_up_activity_btn.setOnClickListener {
            val Intent = Intent(this, sign_up_page::class.java)
            startActivity(Intent)
        }


    }
}