package com.example.keepreal.model

data class Record(
    val id: Int,
    val conversationId: Int?,
    val username: String,
    val content: String,
    val detectionMode: String,
    val score: Int?,
    val result: Boolean?,
    val confidence: Float?,
    val detailedAnalysis: String?,
    val evidence: String?,
    val summary: String?,
    val createdAt: String // 时间戳格式化为字符串
)