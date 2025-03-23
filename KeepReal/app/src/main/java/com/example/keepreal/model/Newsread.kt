package com.example.keepreal.model

data class Newsread(
    val id: Int,
    val username: String,
    val newsId: String,
    val isFinished: Boolean,
    val isFavorite: Boolean
)