package com.example.di_test

interface Factory <T>{
    fun create() : T
}

class LoginViewModelFactory(private val userRepository: UserRepository) :Factory<LoginViewModel>{
    override fun create(): LoginViewModel {
        return LoginViewModel(userRepository)
    }
}