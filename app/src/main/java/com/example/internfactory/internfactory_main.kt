package com.example.internfactory

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View

class MainActivity : Activity() {
    fun signUpActivity(view: View){
        val intent :Intent= Intent(this,sign_up_page::class.java)
        startActivity(intent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_pag_1)
    }
}
