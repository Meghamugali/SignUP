package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.math.sign


class MainActivity : AppCompatActivity() {
    lateinit var etMail: EditText
    lateinit var etPassword: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etMail = findViewById(R.id.etMail)
        etPassword = findViewById(R.id.etPassword)
        validateSignUpInput("","12345")
        val  signUpButton = findViewById<Button>(R.id.button)
        signUpButton.setOnClickListener {
            OnClick()
        }

    }

    private fun validateSignUpInput( etMail : String,
                                     etPassword : String
    ): Boolean {
        if (etMail.isEmpty() || etPassword.isEmpty()){
            return false
        }
        if (etMail in SignUpUtil.existingUsers) {
            return false
        }
        if (etPassword.count{ it.isDigit()  }< 2 ) {
            return false
        }
        return true
    }
    fun OnClick():Unit {
        if(etMail.text.isNullOrBlank() || etPassword.text.isNullOrBlank()){
            Toast.makeText(this, "Please fill the required fields", Toast.LENGTH_SHORT).show()
        }
        else {
            val email: String = etMail.getText().toString()
            val password = etPassword.text.toString()
            val result = SignUpUtil.validateSignUpInput(email,password)
            if (result == true){


            val intent = Intent(this, HomeActivity::class.java)
           intent.putExtra("ekey", email)

            startActivity(intent)
            }
        }
    }

}

