package com.example.data.remote.remote.auth

interface AuthFirebase {
    fun sendSmsCode(phone: String)
}