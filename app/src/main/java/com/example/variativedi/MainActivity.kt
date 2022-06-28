package com.example.variativedi

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.variativedi.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)


        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragmentContainer, HiltTextsFragment())
        transaction.commit()

        setContentView(binding.root)
    }
}