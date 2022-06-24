package com.example.domain

object DomainModule {
    fun provideGetTextsUseCase(
        textsProvider: TextsProvider
    ) : GetTextUseCase {
        return GetTextsUseCaseImpl(textsProvider)
    }
}