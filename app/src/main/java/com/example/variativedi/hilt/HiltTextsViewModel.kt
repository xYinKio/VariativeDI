package com.example.variativedi.hilt

import com.example.ui.TextsReducer
import com.example.ui.TextsViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
internal class HiltTextsViewModel @Inject constructor(textsReducer: TextsReducer)
    : TextsViewModel(textsReducer)