package com.example.di_test

class LoginContainer (userRepository: UserRepository){
    val loginData = LoginUserData()

    val loginViewModelFactory = LoginViewModelFactory(userRepository)
}