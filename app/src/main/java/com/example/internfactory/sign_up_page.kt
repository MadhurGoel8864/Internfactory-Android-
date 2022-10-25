package com.example.internfactory

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText

class sign_up_page : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up_page)

        val sign_in_activity_btn = findViewById<Button>(R.id.login_btn)
        sign_in_activity_btn.setOnClickListener {
            val Intent = Intent(this,sign_in_page::class.java)
            startActivity(Intent)
        }
    }
}
