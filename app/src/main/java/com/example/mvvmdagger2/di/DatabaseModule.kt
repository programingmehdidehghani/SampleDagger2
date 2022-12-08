package com.example.mvvmdagger2.di

import androidx.room.Room
import com.example.mvvmdagger2.db.FakerDB
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideFakerDB() : FakerDB{
        return Room.databaseBuilder(context,FakerDB::class.java,"FakerDB").build()
    }
}