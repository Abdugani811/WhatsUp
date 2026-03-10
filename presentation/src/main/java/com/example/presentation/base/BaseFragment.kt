package com.example.presentation.base

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import io.reactivex.rxjava3.core.Observable

abstract class BaseFragment<VB : ViewBinding>(
    private val inflate: (LayoutInflater, ViewGroup?, Boolean) -> VB
) : androidx.fragment.app.Fragment() {

    private var _binding: VB? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun <T, R> Observable<T>.observer(observer: (R) -> Unit, mapper: (T) -> R) {
        map(mapper).distinctUntilChanged().doOnNext(observer)
    }
}