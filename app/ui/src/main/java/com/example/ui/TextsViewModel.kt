package com.example.ui

import com.example.domain.Text
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow

interface TextsViewModel {
    val texts: Flow<List<Text>>
    fun loadTexts(scope: CoroutineScope)
}