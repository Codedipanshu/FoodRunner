package com.dipanshu.foodrunner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AfterLoginActivity : AppCompatActivity() {

    lateinit var txtMobileNumber: TextView
    lateinit var txtPassword: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_login)

        txtMobileNumber = findViewById(R.id.txtMobileNumber)
        txtPassword = findViewById(R.id.txtPassword)

        if (intent != null) {
            val mobileNumber: String = intent.getStringExtra("txtMobileNumber").toString()
            val password: String = intent.getStringExtra("txtPassword").toString()

            if (mobileNumber != "" && password != "") {
                txtMobileNumber.text = mobileNumber
                txtPassword.text = password
            }
        }
    }
}