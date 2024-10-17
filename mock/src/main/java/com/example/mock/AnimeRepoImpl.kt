package com.example.mock

import com.example.domain.AnimeRepository
import com.example.domain.LoadQuoteResult
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Inject

class AnimeRepoImpl @Inject constructor(): AnimeRepository {

    override suspend fun loadQuote(): LoadQuoteResult {
        return try {
            val quote = "mock quote"
            LoadQuoteResult.Success(quote)
        } catch (e: Exception){
            LoadQuoteResult.Error(e.message ?: "")
        }
    }
}