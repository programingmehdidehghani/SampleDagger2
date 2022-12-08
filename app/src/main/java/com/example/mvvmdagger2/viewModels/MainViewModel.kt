package com.example.mvvmdagger2.viewModels

import androidx.lifecycle.ViewModel
import com.example.mvvmdagger2.repository.ProductRepository

class MainViewModel(val repository: ProductRepository) : ViewModel(){
}