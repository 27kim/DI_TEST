package com.example.di_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var loginViewModel: LoginViewModel
    private var loginData: LoginUserData? = null
    private lateinit var appContainer: AppContainer

    override fun onCreate(savedInstanceState: Bundle?) {
        appContainer = (application as MyApplication).appContainer

        (application as MyApplication).appComponent.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


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