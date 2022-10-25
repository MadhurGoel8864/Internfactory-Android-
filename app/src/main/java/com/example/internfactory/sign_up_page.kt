package com.example.internfactory
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
class sign_up_page : Activity() {
    private lateinit var firstname : TextInputEditText
    private lateinit var lastname : TextInputEditText
    private lateinit var email : TextInputEditText
    private lateinit var password : TextInputEditText
    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up_page)
        button = findViewById(R.id.sign_up_btn)
        firstname = findViewById(R.id.first_name_inp)
        lastname = findViewById(R.id.last_name_inp)
        email= findViewById(R.id.email_inp)
        password= findViewById(R.id.password_form_inp)

        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(p0: Editable?) {
                if (android.util.Patterns.EMAIL_ADDRESS.matcher(email.text.toString()).matches() and (password.text?.isNotEmpty() == true) and (firstname.text?.isNotEmpty()==true) and (lastname.text?.isNotEmpty()==true) ){
                    button.isEnabled = true
                }
                else {
                    button.isEnabled = false
//                    ed1.setError("Invalid Email Format ")
                }
            }
        })
        lastname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(p0: Editable?) {
                if (android.util.Patterns.EMAIL_ADDRESS.matcher(email.text.toString()).matches() and (password.text?.isNotEmpty() == true) and (firstname.text?.isNotEmpty()==true) and (lastname.text?.isNotEmpty()==true) ){
                    button.isEnabled = true
                }
                else {
                    button.isEnabled = false
//                    ed1.setError("Invalid Email Format ")
                }
            }
        })

        email.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(p0: Editable?) {
                if (android.util.Patterns.EMAIL_ADDRESS.matcher(email.text.toString()).matches() and (password.text?.isNotEmpty() == true) and (firstname.text?.isNotEmpty()==true) and (lastname.text?.isNotEmpty()==true) ){
                    button.isEnabled = true
                }
                else {
                    button.isEnabled = false
//                    ed1.setError("Invalid Email Format ")
                }
            }
        })

        password.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(p0: Editable?) {
                if (android.util.Patterns.EMAIL_ADDRESS.matcher(email.text.toString()).matches() and (password.text?.isNotEmpty() == true) and (firstname.text?.isNotEmpty()==true) and (lastname.text?.isNotEmpty()==true) ){
                    button.isEnabled = true
                }
                else {
                    button.isEnabled = false
//                    ed1.setError("Invalid Email Format ")
                }
            }
        })





        val sign_in_activity_btn = findViewById<Button>(R.id.login_btn)
        sign_in_activity_btn.setOnClickListener {
            val Intent = Intent(this,sign_in_page::class.java)
            startActivity(Intent)
        }
    }
}
