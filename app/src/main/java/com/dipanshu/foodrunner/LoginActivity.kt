package com.dipanshu.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var etMobileLogin: EditText
    lateinit var etPasswordLogin: EditText
    lateinit var btnLogin: Button
    lateinit var txtForgot: TextView
    lateinit var txtNewAccount: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etMobileLogin = findViewById(R.id.etMobileLogin)
        etPasswordLogin = findViewById(R.id.etPasswordLogin)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgot = findViewById(R.id.txtForgot)
        txtNewAccount = findViewById(R.id.txtNewAccount)

        btnLogin.setOnClickListener {
            val intent = Intent(this, AfterLoginActivity::class.java)
            val mobile = etMobileLogin.text.toString()
            val password = etPasswordLogin.text.toString()

            if (mobile.length == 10 && password.length >= 4) {
                intent.putExtra("txtMobileNumber", "Mobile Number: $mobile")
                intent.putExtra("txtPassword", "Password: $password")
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please enter valid credentials", Toast.LENGTH_SHORT).show()
            }
        }

        txtForgot.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

        txtNewAccount.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }


    }
}