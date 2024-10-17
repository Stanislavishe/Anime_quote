package com.example.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.AnimeRepository
import com.example.domain.LoadQuoteResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: AnimeRepository,
    private val mapper: LoadQuoteResult.Mapper<QuoteUIState>
): ViewModel() {

    private val _loadQuote = MutableStateFlow<QuoteUIState>(QuoteUIState.Initial("Hello Anime Quote"))
    val loadQuote = _loadQuote.asStateFlow()

    fun load(){
        viewModelScope.launch {
            val uiState = repository.loadQuote().map(mapper)
            _loadQuote.value = uiState
        }
    }
}