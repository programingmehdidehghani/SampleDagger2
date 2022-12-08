package com.example.mvvmdagger2.di

import androidx.lifecycle.ViewModel
import com.example.mvvmdagger2.viewModels.MainViewModel
import com.example.mvvmdagger2.viewModels.MainViewModel2
import dagger.Binds
import dagger.Module


@Module
abstract class ViewModelModule {

    @Binds
    abstract fun mainViewModel(mainViewModel: MainViewModel) : ViewModel

    @Binds
    abstract fun mainViewModel2(mainViewModel2: MainViewModel2) : ViewModel
}