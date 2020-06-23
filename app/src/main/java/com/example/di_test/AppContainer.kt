package com.example.di_test

class AppContainer {
    val retrofit = Retrofit()

    val userLocalDataSource = UserLocalDataSource()
    val userRemoteDataSource = UserRemoteDataSource(retrofit)

    val userRepository = UserRepository(userLocalDataSource, userRemoteDataSource)

    val loginViewModelFactory = LoginViewModelFactory(userRepository)

    // LoginContainer will be null when the user is NOT in the login flow
    var loginContainer : LoginContainer? = null
}