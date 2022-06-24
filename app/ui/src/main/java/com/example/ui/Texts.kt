package com.example.ui

import com.example.domain.Text
import kotlinx.coroutines.flow.Flow

interface Texts {
    val texts: Flow<List<Text>>
}