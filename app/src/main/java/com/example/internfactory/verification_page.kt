package com.example.internfactory

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class verification_page : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification_page)

        val logo_button1=findViewById<LinearLayout>(R.id.title1)
        logo_button1.setOnClickListener{
            val Intent= Intent(this,Home_page::class.java)
            startActivity(Intent)
        }
    }
}