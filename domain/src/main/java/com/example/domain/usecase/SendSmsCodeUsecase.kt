package com.example.domain.usecase

import com.example.domain.repo.AuthRepository

class SendSmsCodeUsecase constructor(
    private val authRepository: AuthRepository
){
    operator fun invoke(phone: String) {
        authRepository.sendSmsCode(phone)
    }

}