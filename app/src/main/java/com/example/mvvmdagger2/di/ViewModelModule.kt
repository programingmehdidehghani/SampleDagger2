package com.example.mvvmdagger2.di

import androidx.lifecycle.ViewModel
import com.example.mvvmdagger2.viewModels.MainViewModel
import com.example.mvvmdagger2.viewModels.MainViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey


@Module
abstract class ViewModelModule {

    @Binds
    @StringKey("mainViewModel")
    @IntoMap
    abstract fun mainViewModel(mainViewModel: MainViewModel) : ViewModel

    @Binds
    @StringKey("mainViewModel2")
    @IntoMap
    abstract fun mainViewModel2(mainViewModel2: MainViewModel2) : ViewModel
}