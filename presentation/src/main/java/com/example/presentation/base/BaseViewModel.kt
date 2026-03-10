package com.example.presentation.base

import android.database.Observable
import androidx.lifecycle.ViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import io.reactivex.rxjava3.subjects.BehaviorSubject
import io.reactivex.rxjava3.subjects.PublishSubject

abstract class BaseViewModel<State : Any, Input : Any, Effect: Any> : ViewModel() {
    private val stateSubject = BehaviorSubject.createDefault(this.getDefaultState())
    val state: BehaviorSubject<State> get() = stateSubject
        .distinctUntilChanged()
        .subscribeOn(Schedulers.computation())
        .observeOn(AndroidSchedulers.mainThread()) as BehaviorSubject<State>

    private val effectsSubject = PublishSubject.create<Effect>()
    val effects : Observable<Effect> get() = effects

    abstract fun getDefaultState(): State

    fun updateState(update: (current: State) -> State) {
        val state = update(stateSubject.blockingFirst())
        stateSubject.onNext(state)
    }

    abstract fun processInput(input: Input)

    fun emitEffect(effect: Effect) {
        effectsSubject.onNext(effect)
    }
}