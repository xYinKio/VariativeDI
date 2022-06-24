package com.example.domain

internal class GetTextsUseCaseImpl(
    private val textsProvider: TextsProvider
) : GetTextUseCase {
    override fun getText(): List<Text> {
        return textsProvider.getTexts()
    }
}