package com.example.mvvmdagger2

import android.app.Application
import com.example.mvvmdagger2.di.ApplicationComponent

class FakerApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.builder.build()
    }
}