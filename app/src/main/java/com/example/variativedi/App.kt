package com.example.variativedi

import android.app.Application

internal class App : Application(){
    val appComponent: AppComponent = DaggerAppComponent.create()
}