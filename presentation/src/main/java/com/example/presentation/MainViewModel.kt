package com.example.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.AnimeRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel(
    private val repository: AnimeRepository
): ViewModel() {

    private val _loadQuote = MutableStateFlow("")
    val loadQuote = _loadQuote.asStateFlow()

    fun load(){
        viewModelScope.launch {
            _loadQuote.value = repository.loadQuote().second
        }
    }
}