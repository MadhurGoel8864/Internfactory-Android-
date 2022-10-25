package com.example.internfactory

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class sign_in_page : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in_page)
        val login_button = findViewById<Button>(R.id.login_btn)
        login_button.setOnClickListener {
            val Intent = Intent(this,sign_up_page::class.java)
            startActivity(Intent)
        }
        val sign_up_activity_btn = findViewById<Button>(R.id.sign_up_btn)
        sign_up_activity_btn.setOnClickListener {
            val Intent = Intent(this,sign_up_page::class.java)
            startActivity(Intent)
        }

        val forgot_pass_activity = findViewById<Button>(R.id.forgot_pass_btn)
        forgot_pass_activity.setOnClickListener {
            val Intent = Intent(    this,Forgot_password_page::class.java)
            startActivity(Intent)
        }
        val image_view=findViewById<ImageView>(R.id.imageView)
        image_view.setOnClickListener{
            val Intent=Intent(this,Home_page::class.java)
            startActivity(Intent)
        }
    }
}

