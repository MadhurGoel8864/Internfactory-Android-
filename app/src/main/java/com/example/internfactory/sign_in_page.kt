package com.example.internfactory

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import com.google.android.material.textfield.TextInputEditText

class sign_in_page : Activity() {
    private lateinit var ed1 : EditText
    private lateinit var login_btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in_page)
        ed1 = findViewById(R.id.ed1)
        ed1.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(p0: Editable?) {
                if (android.util.Patterns.EMAIL_ADDRESS.matcher(ed1.text.toString()).matches() )
                    login_btn.isEnabled = true
                else {
                    login_btn.isEnabled = false
                    ed1.setError("Invalid Email Format ")
                }
            }

        })
//        login_btn = findViewById(R.id.login_btn)
//
//        login_btn.setOnClickListener {  }

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
    }
}

