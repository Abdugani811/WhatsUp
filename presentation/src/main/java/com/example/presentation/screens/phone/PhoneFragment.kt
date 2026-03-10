package com.example.presentation.screens.phone

import android.media.effect.Effect
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.domain.model.User
import com.example.presentation.base.BaseFragment
import com.example.presentation.databinding.FragmentPhoneBinding

class PhoneFragment : BaseFragment<FragmentPhoneBinding>(FragmentPhoneBinding::inflate) {

    private lateinit var viewModel: PhoneViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        viewModel.state.observer(::renderUser) { it.user }
        viewModel.effects.onNext(::handleEffects)

    }

    private fun renderUser(user: User?) {

    }

    private fun handleEffects(effect: Effect) {

    }


}