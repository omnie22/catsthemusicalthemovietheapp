package com.example.catsthemusicalthemovietheapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.catsthemusicalthemovietheapp.R
import com.example.catsthemusicalthemovietheapp.adapter.CatAdapter
import com.example.catsthemusicalthemovietheapp.databinding.ActivityMainBinding
import com.example.catsthemusicalthemovietheapp.viewmodel.CatViewModel

class MainActivity : AppCompatActivity() {
    private val viewModel by viewModels<CatViewModel>()
    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.catBtn.setOnClickListener{
            viewModel.getBreeds()
        }
        binding.rvImages.setOnClickListener{
            val toDetail = Intent(this, BreedDetailActivity::class.java)
            Log.d("nope", "activity machine broke")
            startActivity(toDetail)
        }

        viewModel.breeds.observe(this){
            Log.d("poopy", it[0].toString())
            (binding.rvImages.adapter as CatAdapter).updateCats(it)
        }
        binding.rvImages.adapter = CatAdapter()
    }
}