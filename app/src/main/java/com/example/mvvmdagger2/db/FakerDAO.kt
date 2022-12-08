package com.example.mvvmdagger2.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mvvmdagger2.models.Product

@Dao
interface FakerDAO {

    @Insert
    suspend fun addProducts(products : List<Product>)

    @Query("SELECT * FROM Product")
    suspend fun getProducts() : List<Product>
}