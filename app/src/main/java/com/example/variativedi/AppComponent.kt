package com.example.variativedi

import dagger.Component

@Component(
    modules = [AppModule::class]
)
internal interface AppComponent {
    fun textsViewModelFactory() : TextsViewModelFactory
}