package com.example.whatsup.app

import android.app.Application
import com.example.whatsup.di.localModule
import com.example.whatsup.di.remoteModule
import com.example.whatsup.di.repositoryModule
import com.example.whatsup.di.useCaseModule
import com.example.whatsup.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(repositoryModule, useCaseModule, localModule, remoteModule, viewModelModule)
        }

    }
}