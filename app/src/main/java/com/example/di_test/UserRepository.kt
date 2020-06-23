package com.example.di_test

class UserRepository (private val userLocalDataSource : UserLocalDataSource,
private val userRemoteDataSource : UserRemoteDataSource)

class UserRemoteDataSource(retrofit : Retrofit) {

}

class UserLocalDataSource {

}
