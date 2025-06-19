package com.example.data.repo

import com.example.data.remote.remote.Firebase
import com.example.domain.repo.AuthRepository

class AuthRepositoryImpl constructor(
    private val firebase: Firebase
): AuthRepository {
    override fun sendSmsCode(phone: String) {
        firebase.sendSmsCode(phone)
    }
}