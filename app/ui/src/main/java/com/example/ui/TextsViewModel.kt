package com.example.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

open class TextsViewModel(
    private val textsReducer: TextsReducer
)  : ViewModel(), Texts by textsReducer{
    init {
        textsReducer.loadTexts(viewModelScope)
    }
}

