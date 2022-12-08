package com.example.mvvmdagger2.repository

import com.example.mvvmdagger2.retrofit.FakerApi
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakerApi: FakerApi) {

}