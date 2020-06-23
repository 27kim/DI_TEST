package com.example.di_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var loginViewModel: LoginViewModel
    private var loginData: LoginUserData? = null
    private lateinit var appContainer: AppContainer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appContainer = (application as MyApplication).appContainer

        // Login flow has started. Populate loginContainer in AppContainer`
        appContainer.loginContainer = LoginContainer(appContainer.userRepository)
        loginViewModel = appContainer.loginContainer!!.loginViewModelFactory.create()
        loginData = appContainer.loginContainer!!.loginData
    }

    override fun onDestroy() {
        appContainer.loginContainer = null
        super.onDestroy()
    }
}