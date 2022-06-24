package com.example.ui

import com.example.domain.GetTextUseCase

object UIModule {

    fun provideTextsReducer(getTextUseCase: GetTextUseCase) : TextsReducer {
        return TextsReducer(getTextUseCase)
    }
}