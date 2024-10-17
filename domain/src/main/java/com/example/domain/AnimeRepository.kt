package com.example.domain

interface AnimeRepository {
    suspend fun loadQuote(): LoadQuoteResult
}