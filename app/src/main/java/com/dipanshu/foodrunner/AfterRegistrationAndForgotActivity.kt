package com.dipanshu.foodrunner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AfterRegistrationAndForgotActivity : AppCompatActivity() {

    lateinit var txtName: TextView
    lateinit var txtEmail: TextView
    lateinit var txtMobileNumber: TextView
    lateinit var txtAddress: TextView
    lateinit var txtPassword: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_registration_and_forgot)

        txtName = findViewById(R.id.txtName)
        txtEmail = findViewById(R.id.txtEmail)
        txtMobileNumber = findViewById(R.id.txtMobileNumber)
        txtAddress = findViewById(R.id.txtAddress)
        txtPassword = findViewById(R.id.txtPassword)

        if(intent!=null){
            txtName.text = intent.getStringExtra("txtName")
            txtEmail.text = intent.getStringExtra("txtEmail")
            txtMobileNumber.text = intent.getStringExtra("txtMobile")
            txtAddress.text = intent.getStringExtra("txtAddress")
            txtPassword.text = intent.getStringExtra("txtPassword")
        }
    }
}