package com.example.variativedi.hilt

import androidx.fragment.app.viewModels
import com.example.ui.TextsFragment
import com.example.ui.TextsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
internal class HiltTextsFragment : TextsFragment(){
    override fun viewModel(): TextsViewModel {
        val vm: HiltTextsViewModel by viewModels()
        return vm
    }
}