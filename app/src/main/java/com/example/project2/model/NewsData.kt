package com.example.project2.model

data class NewsData (
    val articles: List<Article>,
    val status: String,
    val totalResult: Int
)