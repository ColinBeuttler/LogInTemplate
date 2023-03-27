package com.colinbeuttler.logintemplate

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var newUserInfo = createPreview()
        var registerButton = findViewById<Button>(R.id.register_button)
        registerButton.setOnClickListener { previewLogIn(newUserInfo) }
    }

    private fun createPreview(): LogInInfo {
        var firstName = findViewById<TextInputEditText>(R.id.text_input_first_name)
        var lastName = findViewById<TextInputEditText>(R.id.text_input_last_name)
        var emailInput = findViewById<TextInputEditText>(R.id.text_input_email)
        var inputNumber = findViewById<TextInputEditText>(R.id.text_input_phone_number)
        var passwordInput = findViewById<TextInputEditText>(R.id.text_input_password)
        return LogInInfo(firstName, lastName, emailInput, inputNumber, passwordInput)
    }
    private fun previewLogIn(userInfo: LogInInfo) {
        println(userInfo)
        Toast.makeText(this,userInfo.toString(), Toast.LENGTH_LONG).show()
    }
}
