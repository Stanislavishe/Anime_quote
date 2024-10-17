package com.example.data

import com.example.domain.AnimeRepository
import com.example.domain.LoadQuoteResult
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Inject

class AnimeRepoImpl @Inject constructor(
    private val api: AnimeApi
): AnimeRepository {

    override suspend fun loadQuote(): LoadQuoteResult {
        return try {
            val quote = api.getQuote().quote
            LoadQuoteResult.Success(quote)
        } catch (e: Exception){
            LoadQuoteResult.Error(e.message ?: "")
        }
    }
}