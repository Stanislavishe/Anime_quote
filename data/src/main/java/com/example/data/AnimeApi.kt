package com.example.data

import retrofit2.http.GET

interface AnimeApi {
    @GET("api/random")
    suspend fun getQuote(): QuoteModel
}