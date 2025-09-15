package com.freetaxer.utils

object TaxUtils {
    const val VAT_RATE = 0.24

    fun calculateNetAmount(gross: Double): Double {
        return gross / (1 + VAT_RATE)
    }

    fun calculateVAT(gross: Double): Double {
        return gross - calculateNetAmount(gross)
    }
}

