package com.example.keepreal.model

data class User(
    val id: Int,
    val username: String,
    val password: String,
    val email: String,
    val avatar: String?,
    val gender: String,
    val userid: String,
    val verificationCode: String?
)