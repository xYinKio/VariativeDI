package com.example.ui

import com.example.domain.GetTextUseCase
import com.example.domain.Text
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class TextsReducer constructor(
    private val getTextUseCase: GetTextUseCase,
) : Texts {
    private val _texts = MutableStateFlow<List<Text>>(listOf())
    override val texts: Flow<List<Text>> = _texts.asStateFlow()

    fun loadTexts(scope: CoroutineScope){
        scope.launch(Dispatchers.IO) {
            _texts.value = getTextUseCase.getText()
        }
    }
}