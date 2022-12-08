package com.example.mvvmdagger2.di

import android.content.Context
import com.example.mvvmdagger2.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, DatabaseModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context: Context) : ApplicationComponent
    }
}