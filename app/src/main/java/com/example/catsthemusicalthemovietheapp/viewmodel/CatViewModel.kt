package com.example.catsthemusicalthemovietheapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.catsthemusicalthemovietheapp.model.Breed
import com.example.catsthemusicalthemovietheapp.repo.CatRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.Dispatcher
import java.util.*

class CatViewModel : ViewModel() {
    private val _breeds = MutableLiveData<List<Breed>>()
    val breeds: LiveData<List<Breed>> get() =_breeds

    fun getBreeds(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = CatRepo.getbreeds()
            if(response.isSuccessful && !response.body().isNullOrEmpty())
                _breeds.postValue(response.body())
        }
    }
}
