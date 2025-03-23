package com.example.keepreal.model

data class DetectionHistory(
    val id: Int,
    val userId: Int,
    val detectionType: String,
    val detectionContent: String?,
    val filePath: String?,
    val result: String,
    val detectedAt: String // 时间戳格式化为字符串
)