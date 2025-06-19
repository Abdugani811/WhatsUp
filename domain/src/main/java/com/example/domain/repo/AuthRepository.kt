package com.example.domain.repo

interface AuthRepository {
    fun sendSmsCode(phone: String)
}