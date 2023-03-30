package com.colinbeuttler.logintemplate

import com.google.android.material.textfield.TextInputEditText

 data class LogInInfo(
    val firstName: String,
    val lastName: String,
    val email: String,
    val phoneNumber: String,
    val password: String

): java.io.Serializable
     {
    override fun toString(): String {
        return "LogInInfo(firstName=$firstName, lastName=$lastName, email=$email, phoneNumber=$phoneNumber, password=$password)"
    }
}



