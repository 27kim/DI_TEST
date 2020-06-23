package com.example.di_test

import android.app.Application

class MyApplication : Application(){
    val appContainer = AppContainer()

    // appComponent lives in the Application class to share its lifecycle
    val appComponent = DaggerApplicationGraph.create()
}