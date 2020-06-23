package com.example.di_test

import javax.inject.Inject
import javax.inject.Singleton

// Scope this class to a component using @Singleton scope (i.e. ApplicationGraph)
@Singleton
class UserRepository @Inject constructor(
    private val userLocalDataSource: UserLocalDataSource,
    private val userRemoteDataSource: UserRemoteDataSource
)

class UserRemoteDataSource @Inject constructor(retrofit: Retrofit) {

}

class UserLocalDataSource @Inject constructor() {

}
