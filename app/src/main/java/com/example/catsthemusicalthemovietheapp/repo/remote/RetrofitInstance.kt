package com.example.catsthemusicalthemovietheapp.repo.remote

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitInstance {

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://api.thecatapi.com")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val catService: CatService = retrofit.create(CatService::class.java)
}