package com.example.signup

object SignUpUtil {

    val existingUsers = listOf("demo@gmail.com", "carl@gmail.com")

    fun validateSignUpInput(etMail: String, etPassword: String): Boolean {
        // non empty
        // email is available in existingUsers
        // digits in Pwd < 2
        isEmailPasswordEmpty(etMail,etPassword)




        if (isValidEmail(etMail)) {

            if (isLessthan2Digit(etPassword)) {
                return false
            }
            return true
        }
        return false
    }
    fun isEmailPasswordEmpty(etmail:String, pasword: String): Boolean{
        if (etmail.isEmpty() || pasword.isEmpty()) {
            return false
        }
        return true
    }

    fun isValidEmail(etmail: String): Boolean {
        if(etmail in existingUsers){
            return true
        }
        return false
    }

    fun isLessthan2Digit(etPassword: String):Boolean{
        if (etPassword.count { it.isDigit() } < 2) {
            return false
        }
        return true
    }
}