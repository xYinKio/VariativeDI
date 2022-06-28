package com.example.variativedi

import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.ui.TextsFragment
import com.example.ui.TextsViewModel
import com.example.ui.TextsViewModelImpl
import javax.inject.Inject

internal class DaggerTextsFragment : TextsFragment() {

    override fun viewModel(): TextsViewModel {
        ViewModelProvider(requireActivity(), )

        val vm: TextsViewModelImpl by viewModels{ (requireActivity().application as App).appComponent.textsViewModelFactory() }
        return vm
    }
}

internal class TextsViewModelFactory @Inject constructor(
    private val delegate: TextsViewModel
) : ViewModelProvider.Factory{
    override fun create(modelClass: Class<TextsViewModelImpl>): TextsViewModelImpl {
        return TextsViewModelImpl(delegate)
    }
}