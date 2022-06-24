package com.example.data

import com.example.domain.Text
import com.example.domain.TextsProvider

internal class TextsProviderImpl : TextsProvider {

    override fun getTexts(): List<Text> {
        return listOf(
            Text("One"),
            Text("Two"),
            Text("Three"),
            Text("Four"),
            Text("Five"),
            Text("Six"),
        )
    }
}

object DataModule{
    fun provideTextsProvider() : TextsProvider {
        return TextsProviderImpl()
    }
}