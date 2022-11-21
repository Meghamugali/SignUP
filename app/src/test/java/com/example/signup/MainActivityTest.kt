package com.example.signup

import com.google.common.truth.Truth
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class MainActivityTest {

    @Test
    fun `empty email return false`() {
        val result = SignUpUtil.isEmailPasswordEmpty(
            "asd@gmail.com",
            ""
        )
        assertThat(result).isFalse()

    }

    @Test
    fun `valid email and password returns true `() {
        val result = SignUpUtil.validateSignUpInput(
            "demo@gmail.com",
            "demo3"
        )
        assertThat(result).isTrue()

    }

    @Test
    fun ` email already exists `() {
        val result = SignUpUtil.isValidEmail(
            "demo@gmail.com",
        )
        assertThat(result).isTrue()

    }


    @Test
    fun ` less than 2 digit password return false`() {
        val result = SignUpUtil.isLessthan2Digit(
            "demo1234",
        )
        assertThat(result).isFalse()

    }
}
