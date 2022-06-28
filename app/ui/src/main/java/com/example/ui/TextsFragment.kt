package com.example.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.ui.databinding.LayoutTextsBinding


open class TextsFragment : Fragment(R.layout.layout_texts) {

    private val viewModel: TextsViewModel by lazy { viewModel() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = LayoutTextsBinding.bind(view)

        lifecycleScope.launchWhenStarted {
            viewModel.texts.collect{
                binding.textView.text = it.joinToString("\n")
            }
        }
    }

    protected open fun viewModel() : TextsViewModel {
        val vm: TextsViewModelImpl by viewModels()
        return vm
    }

}



