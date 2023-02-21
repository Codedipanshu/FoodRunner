package com.dipanshu.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ForgotPasswordActivity : AppCompatActivity() {

    lateinit var etMobileForgot: EditText
    lateinit var etEmailForgot: EditText
    lateinit var btnNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        etMobileForgot = findViewById(R.id.etMobileForgot)
        etEmailForgot = findViewById(R.id.etEmailForgot)
        btnNext = findViewById(R.id.btnNext)
        val intent = Intent(this, AfterRegistrationAndForgotActivity::class.java)

        btnNext.setOnClickListener {
            if (etMobileForgot.text.length == 10 && etEmailForgot.text.isNotBlank()) {
                intent.putExtra("txtMobile", etMobileForgot.text.toString())
                intent.putExtra("txtEmail", etEmailForgot.text.toString())
                startActivity(intent)
            }
        }
    }
}