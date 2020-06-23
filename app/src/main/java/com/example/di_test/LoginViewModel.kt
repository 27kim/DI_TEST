package com.example.di_test

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class LoginViewModel @Inject constructor(userRepository: UserRepository) : ViewModel(){

}