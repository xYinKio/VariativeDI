package com.example.variativedi.di

import com.example.data.DataModule
import com.example.domain.DomainModule
import com.example.domain.GetTextUseCase
import com.example.ui.TextsReducer
import com.example.ui.UIModule
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal class AppModule {
    @Provides
    fun provideGetTextsUseCase() : GetTextUseCase {
        val textsProvider = DataModule.provideTextsProvider()
        return DomainModule.provideGetTextsUseCase(textsProvider)
    }

    @Provides
    fun provideTextsReducer(getTextUseCase: GetTextUseCase) : TextsReducer {
        return UIModule.provideTextsReducer(getTextUseCase)
    }
}