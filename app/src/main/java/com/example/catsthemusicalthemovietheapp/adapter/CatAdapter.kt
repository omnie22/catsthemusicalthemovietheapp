package com.example.catsthemusicalthemovietheapp.adapter

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.catsthemusicalthemovietheapp.databinding.ActivityMainBinding
import com.example.catsthemusicalthemovietheapp.databinding.ItemImageBinding
import com.example.catsthemusicalthemovietheapp.extensions.loadUrl
import com.example.catsthemusicalthemovietheapp.model.Breed
import com.example.catsthemusicalthemovietheapp.view.BreedDetailActivity
import com.example.catsthemusicalthemovietheapp.view.MainActivity
import kotlinx.parcelize.Parcelize

class CatAdapter : RecyclerView.Adapter<CatAdapter.CatViewHolder>() {

    private val breeds = mutableListOf<Breed>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        return CatViewHolder.getInstance(parent)
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        breeds[position].image?.url?.let { holder.loadUrl(breeds[position]) }
    }

    override fun getItemCount(): Int {
        return breeds.size
    }
    fun updateCats(breeds: List<Breed>){
        val size = this.breeds.size
        this.breeds.clear()
        notifyItemRangeRemoved(0, size)

        this.breeds.addAll(breeds)
        notifyItemRangeInserted(0, breeds.size)
    }
    class CatViewHolder(
        private val binding: ItemImageBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun loadUrl(breed: Breed) = with(binding){
            breed.image?.url?.let { ivImage.loadUrl(it) }
            ivImage.setOnClickListener{
                Log.d("ye?", breed.name)
                val context = it.getContext()
                val toDetail = Intent(context, BreedDetailActivity::class.java)
                toDetail.putExtra("cat", breed)
                startActivity(context, toDetail, null)
            }
            tvUrl.text = breed.name
        }
        companion object {
            fun getInstance(parent: ViewGroup): CatViewHolder {
                val binding = ItemImageBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                return CatViewHolder(binding)
            }
        }
    }
}