package com.example.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.AnimeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
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