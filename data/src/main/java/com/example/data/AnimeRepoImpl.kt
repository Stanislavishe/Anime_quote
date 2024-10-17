package com.example.data

import com.example.domain.AnimeRepository
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Inject

class AnimeRepoImpl @Inject constructor(
    private val api: AnimeApi
): AnimeRepository {

    override suspend fun loadQuote(): Pair<Boolean, String> {
        return try {
            val quote = api.getQuote().quote
            Pair(true, quote)
        } catch (e: Exception){
            Pair(false, "${e.message}")
        }
    }
}