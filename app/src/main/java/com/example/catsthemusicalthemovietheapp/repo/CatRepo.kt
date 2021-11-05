package com.example.catsthemusicalthemovietheapp.repo

import com.example.catsthemusicalthemovietheapp.model.Breed
import com.example.catsthemusicalthemovietheapp.repo.remote.RetrofitInstance
import retrofit2.Response

object CatRepo {

    suspend fun getbreeds(): Response<List<Breed>> {
        return RetrofitInstance.catService.getBreeds()
    }

}