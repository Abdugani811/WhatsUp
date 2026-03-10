package com.example.data.repo

import com.example.data.remote.remote.auth.AuthFirebase
import com.example.domain.repo.AuthRepository

class AuthRepositoryImpl constructor(
    private val authFirebase: AuthFirebase
): AuthRepository {
    override fun sendSmsCode(phone: String) {
        authFirebase.sendSmsCode(phone)
    }
}