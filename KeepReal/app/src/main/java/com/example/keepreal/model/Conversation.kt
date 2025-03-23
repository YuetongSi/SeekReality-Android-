package com.example.keepreal.model

data class Conversation(
    val id: Int,
    val username: String,
    val userMessage: String,
    val assistantMessage: String,
    val mode: String,
    val timestamp: String // 时间戳格式化为字符串
)