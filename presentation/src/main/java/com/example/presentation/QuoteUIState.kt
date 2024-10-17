package com.example.presentation

import android.graphics.Color
import android.widget.TextView

interface QuoteUIState {

    fun show(showQuote: ShowQuote)

    data class Success(private val text: String) : QuoteUIState {
        override fun show(showQuote: ShowQuote) {
            showQuote.show(text)
            showQuote.showColor(Color.GREEN)
        }
    }

    data class Error(private val message: String) : QuoteUIState {
        override fun show(showQuote: ShowQuote) {
            showQuote.show(message)
            showQuote.showColor(Color.RED)
        }
    }

    data class Initial(private val initialMes: String) : QuoteUIState {
        override fun show(showQuote: ShowQuote) {
            showQuote.show(initialMes)
            showQuote.showColor(Color.BLACK)
        }
    }
}

interface ShowQuote {

    fun show(text: String)

    fun showColor(color: Int)
}