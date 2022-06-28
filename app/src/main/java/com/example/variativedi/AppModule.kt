package com.example.variativedi

import com.example.data.DataModule
import com.example.domain.DomainModule
import com.example.domain.GetTextUseCase
import com.example.ui.TextsViewModel
import com.example.ui.UIModule
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
internal class AppModule {
    @Provides
    fun provideGetTextsUseCase() : GetTextUseCase {
        val textsProvider = DataModule.provideTextsProvider()
        return DomainModule.provideGetTextsUseCase(textsProvider)
    }

    @Provides
    fun provideTextsViewModelDelegate(getTextUseCase: GetTextUseCase) : TextsViewModel {
        return  UIModule.provideTextsViewModelDelegate(getTextUseCase)
    }
}