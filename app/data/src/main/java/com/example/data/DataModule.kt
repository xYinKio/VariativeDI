package com.example.data

import com.example.domain.TextsProvider

object DataModule{
    fun provideTextsProvider() : TextsProvider {
        return TextsProviderImpl()
    }
}