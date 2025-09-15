package com.freetaxer.models

data class Income(
    val id: Int = 0,
    val dateTime: String,
    val description: String,
    val client: String,
    val grossAmount: Double,
    val netAmount: Double,
    val vat: Double,
    val category: String
)

