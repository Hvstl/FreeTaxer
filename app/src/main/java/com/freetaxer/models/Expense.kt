package com.freetaxer.models

data class Expense(
    val id: Int = 0,
    val dateTime: String,
    val description: String,
    val supplier: String,
    val grossAmount: Double,
    val netAmount: Double,
    val vat: Double,
    val category: String
)

