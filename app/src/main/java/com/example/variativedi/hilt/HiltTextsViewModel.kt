package com.example.variativedi.hilt

import com.example.ui.TextsViewModel
import com.example.ui.TextsViewModelImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
internal class HiltTextsViewModel @Inject constructor(delegate: TextsViewModel)
    : TextsViewModelImpl(delegate)