package com.colinbeuttler.logintemplate

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.colinbeuttler.logintemplate.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val newUserInfo = createPreview()
        val registerButton = findViewById<Button>(R.id.register_button)
        registerButton.setOnClickListener { previewLogIn() }
    }

    private fun createPreview(): LogInInfo {
        return LogInInfo(
            findViewById<TextInputEditText>(R.id.text_input_first_name).text.toString(),
            findViewById<TextInputEditText>(R.id.text_input_last_name).text.toString(),
            findViewById<TextInputEditText>(R.id.text_input_email).text.toString(),
            findViewById<TextInputEditText>(R.id.text_input_phone_number).text.toString(),
            findViewById<TextInputEditText>(R.id.text_input_password).text.toString()
        )
    }
    private fun previewLogIn() {
        val newUserInfo = createPreview()
        println(newUserInfo)
        Toast.makeText(this,newUserInfo.toString(), Toast.LENGTH_LONG).show()
    }
}
