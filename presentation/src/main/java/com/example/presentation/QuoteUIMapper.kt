package com.example.presentation

import com.example.domain.LoadQuoteResult
import javax.inject.Inject

class QuoteUIMapper @Inject constructor(): LoadQuoteResult.Mapper<QuoteUIState> {
    override fun mapSuccess(quote: String): QuoteUIState {
        return QuoteUIState.Success(quote)
    }

    override fun mapError(message: String): QuoteUIState {
        return QuoteUIState.Error(message)
    }
}