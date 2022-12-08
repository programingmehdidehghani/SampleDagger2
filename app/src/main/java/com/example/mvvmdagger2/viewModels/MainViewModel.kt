package com.example.mvvmdagger2.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmdagger2.models.Product
import com.example.mvvmdagger2.repository.ProductRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: ProductRepository,private val randomize: Randomize) : ViewModel(){

    val products : LiveData<List<Product>>
    get() = repository.products

    init {
        viewModelScope.launch {
            repository.getProducts()
        }
    }
}

class Randomize @Inject constructor(){
    fun doAction(){

    }
}