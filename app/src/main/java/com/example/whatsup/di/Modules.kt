package com.example.whatsup.di

import org.koin.dsl.module
import com.example.data.repo.AuthRepository

val repositoryModule = module {
    single<AuthRepository> { AuthRepositoryImpl(get()) }
}

val useCaseModule = module {
    single {SendSmsCodeUsecase(get())}
}

val localModule = module {
    single <UserStorage> {UserStorageImpl()}
}

val remoteModule = module {
    single <AuthFirebase> { AuthFirebaseImpl() }
}

val viewModelModule = module {
    viewModel {PhoneViewModel(get())}
}