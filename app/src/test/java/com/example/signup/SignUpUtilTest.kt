package com.example.signup


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class SignUpUtilTest {

    @Test
    fun `empty email return false`() {
        val result =  SignUpUtil.validateSignUpInput(
            "",
        "1234"
        )
        assertThat(result). isFalse()

    }

    @Test
    fun `valid email and password returns true `() {
        val result =  SignUpUtil.validateSignUpInput(
            "demo1@gmail.com",
            "1234"
        )
        assertThat(result). isTrue()

    }

    @Test
    fun ` email already exists `() {
        val result =  SignUpUtil.validateSignUpInput(
            "demo@gmail.com",
            "1234"
        )
        assertThat(result). isFalse()

    }

    @Test
    fun ` empty password returns false`() {
        val result =  SignUpUtil.validateSignUpInput(
            "demo@gmail.com",
            ""
        )
        assertThat(result). isFalse()

    }

    @Test
    fun ` less than 2 digit password return false`() {
        val result =  SignUpUtil.validateSignUpInput(
            "demo@gmail.com",
            "asdfg2"
        )
        assertThat(result). isFalse()

    }
}