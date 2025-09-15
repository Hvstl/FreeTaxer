package com.freetaxer.models

data class User(
    val id: Int = 0,
    val username: String,
    val passwordHash: String,
    val pin: String?
)

