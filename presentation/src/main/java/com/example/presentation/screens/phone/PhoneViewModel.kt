package com.example.presentation.screens.phone

import androidx.lifecycle.ViewModel
import com.example.domain.usecase.auth.SendSmsCodeUsecase

class PhoneViewModel constructor(
    private val SendSmsCodeUsecase: SendSmsCodeUsecase
) : ViewModel() {

}