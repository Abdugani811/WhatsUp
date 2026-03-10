package com.example.presentation.screens.phone

import androidx.lifecycle.ViewModel
import com.example.domain.model.User
import com.example.domain.usecase.auth.SendSmsCodeUsecase
import com.example.presentation.base.BaseViewModel
import com.example.presentation.screens.phone.PhoneViewModel.State

class PhoneViewModel constructor(
    private val SendSmsCodeUsecase: SendSmsCodeUsecase
) : BaseViewModel <State, PhoneViewModel.Input, PhoneViewModel.Effect>() {

    data class State(
        val user: User? = null
    )

    class Effect

    class Input

    override fun getDefaultState() = State()


    override fun processInput(input: Effect) {

    }
}