package com.example.mock

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class QuoteModel(
    val quote: String
)