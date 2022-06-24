package com.example.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

open class TextsViewModelImpl(
    private val delegate: TextsViewModel
)  : ViewModel(), TextsViewModel by delegate{
    init {
        delegate.loadTexts(viewModelScope)
    }
}

