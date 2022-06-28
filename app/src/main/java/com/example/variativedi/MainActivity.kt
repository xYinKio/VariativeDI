package com.example.variativedi

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.ui.TextsFragment
import com.example.variativedi.databinding.ActivityMainBinding

internal class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)


        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragmentContainer, DaggerTextsFragment())
        transaction.commit()

        setContentView(binding.root)
    }
}