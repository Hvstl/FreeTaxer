package com.freetaxer.utils

object ValidationUtils {
    fun isValidAmount(amount: String): Boolean {
        return amount.toDoubleOrNull() != null
    }

    fun isValidUsername(username: String): Boolean {
        return username.length >= 3
    }

    fun isValidPassword(password: String): Boolean {
        return password.length >= 6
    }

    fun isValidPIN(pin: String): Boolean {
        return pin.length == 4 && pin.all { it.isDigit() }
    }
}

