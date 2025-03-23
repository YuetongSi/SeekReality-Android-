package com.example.keepreal.model

data class Newslist(
    val id: String,
    val ctime: String?, // 时间戳格式化为字符串
    val title: String,
    val source: String?,
    val content: String?,
    val picUrl: String?,
    val url: String?,
    val fakeScore: Float,
    val category: String?
)