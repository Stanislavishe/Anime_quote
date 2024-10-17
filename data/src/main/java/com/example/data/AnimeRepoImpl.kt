package com.example.data

import com.example.domain.AnimeRepository
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class AnimeRepoImpl(
    private val api: AnimeApi
): AnimeRepository {
    constructor(): this(
        Retrofit.Builder().baseUrl("https://animechan.xyz/")
            .addConverterFactory(MoshiConverterFactory.create()).build()
            .create(AnimeApi::class.java)
    )
    override suspend fun loadQuote(): Pair<Boolean, String> {
        return try {
            val quote = api.getQuote().quote
            Pair(true, quote)
        } catch (e: Exception){
            Pair(false, "${e.message}")
        }
    }
}