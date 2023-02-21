package com.dipanshu.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegistrationActivity : AppCompatActivity() {

    lateinit var etName: EditText
    lateinit var etEmail: EditText
    lateinit var etMobileRegister: EditText
    lateinit var etAddress: EditText
    lateinit var etPasswordRegister: EditText
    lateinit var etConformPassword: EditText
    lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        title = "Register Yourself"

        etName = findViewById(R.id.etName)
        etEmail = findViewById(R.id.etEmail)
        etMobileRegister = findViewById(R.id.etMobileRegister)
        etAddress = findViewById(R.id.etAddress)
        etPasswordRegister = findViewById(R.id.etPasswordRegister)
        etConformPassword = findViewById(R.id.etConformPassword)
        btnRegister = findViewById(R.id.btnRegister)

        val intent = Intent(this, AfterRegistrationAndForgotActivity::class.java)

        btnRegister.setOnClickListener {
            if (etMobileRegister.text.length == 10 && etName.text.length >= 3 && etEmail.text.isNotBlank() && etAddress.text.isNotBlank() && etPasswordRegister.text.length >= 4 && etPasswordRegister.text.toString().equals(etConformPassword.text.toString())) {
                intent.putExtra("txtName", etName.text.toString())
                intent.putExtra("txtEmail", etEmail.text.toString())
                intent.putExtra("txtMobile", etMobileRegister.text.toString())
                intent.putExtra("txtAddress", etAddress.text.toString())
                intent.putExtra("txtPassword", etPasswordRegister.text.toString())
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please enter valid credential", Toast.LENGTH_SHORT).show()
            }
        }
    }
}