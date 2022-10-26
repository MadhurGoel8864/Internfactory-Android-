package com.example.internfactory

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class Forgot_password_page : Activity() {
    private lateinit var email_inp : TextInputEditText
    private lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password_page)
        button = findViewById(R.id.otp_btn)
        email_inp = findViewById(R.id.email_inp)
        email_inp.addTextChangedListener(object:TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(p0: Editable?) {
                if (android.util.Patterns.EMAIL_ADDRESS.matcher(email_inp.text.toString()).matches()){
                    button.isEnabled = true
                }
            }
        }

        )


        val send_btn = findViewById<Button>(R.id.otp_btn)
        send_btn.setOnClickListener {
            val Intent = Intent(this,verification_page::class.java)
            startActivity(Intent)
        }

    }
}