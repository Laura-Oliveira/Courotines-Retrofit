package com.coroutines.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity()
{
    val viewModel:MainViewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.getWeatherData()
    }
}