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

        val registerButton = binding.registerButton
        registerButton.setOnClickListener { previewLogIn() }
    }

    private fun createPreview(): LogInInfo {
        return LogInInfo(
            binding.textInputFirstName.text.toString(),
            binding.textInputLastName.text.toString(),
            binding.textInputEmail.text.toString(),
            binding.textInputPhoneNumber.text.toString(),
            binding.textInputPassword.text.toString()
        )
    }

    private fun previewLogIn() {
        val newUserInfo = createPreview()
        println(newUserInfo)
        Toast.makeText(this, newUserInfo.toString(), Toast.LENGTH_LONG).show()
    }
}
