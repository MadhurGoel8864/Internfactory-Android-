package com.example.internfactory

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class sign_up_page : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up_page)
        val sign_in_activity_btn = findViewById<Button>(R.id.login_btn)
        sign_in_activity_btn.setOnClickListener {
            val Intent = Intent(this,sign_in_page::class.java)
            startActivity(Intent)
        }
        val image_view1=findViewById<ImageView>(R.id.imageView2)
        image_view1.setOnClickListener{
            val Intent=Intent(this,Home_page::class.java)
            startActivity(Intent)
        }
    }
}
