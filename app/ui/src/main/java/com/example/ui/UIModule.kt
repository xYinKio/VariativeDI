package com.example.ui

import com.example.domain.GetTextUseCase

object UIModule {

    fun provideTextsViewModelDelegate(getTextUseCase: GetTextUseCase) : TextsViewModel {
        return TextsViewModelDelegate(getTextUseCase)
    }
}