package com.example.mock

import retrofit2.http.GET

interface AnimeApi {
    @GET("api/random")
    suspend fun getQuote(): QuoteModel
}