package com.example.catsthemusicalthemovietheapp.repo.remote

import com.example.catsthemusicalthemovietheapp.model.Breed
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CatService {
    @GET("v1/breeds/")
    suspend fun getBreeds(
//        @Query("count") count: Int,
//        @Query("urls") urls: Boolean,
//        @Query("httpsUrls") httpsUrls: Boolean,
    ): Response<List<Breed>>
}