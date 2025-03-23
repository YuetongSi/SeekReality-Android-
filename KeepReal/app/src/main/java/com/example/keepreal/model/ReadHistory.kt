package com.example.keepreal.model

data class ReadHistory(
    val id: Int,
    val username: String,
    val newsId: String,
    val readTime: Int,
    val lastReadAt: String, // 时间戳格式化为字符串
    val createdAt: String // 时间戳格式化为字符串
)
