package com.example.catsthemusicalthemovietheapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.catsthemusicalthemovietheapp.databinding.ActivityBreedDetailBinding
import com.example.catsthemusicalthemovietheapp.extensions.loadUrl
import com.example.catsthemusicalthemovietheapp.model.Breed

class BreedDetailActivity : AppCompatActivity() {
    private val binding by lazy { ActivityBreedDetailBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val cat = intent.getParcelableExtra<Breed>("cat")
//        img
        if (cat != null) {
            binding.beegCat.loadUrl(cat.image?.url.toString())
            binding.nameView.text = "Name: " + cat.name
            binding.cfaView.text = "CFA url: " + cat.cfaUrl
            binding.vetstreetView.text = "Vetstreet url: " + cat.vetstreetUrl
            binding.vcaView.text = "VCA hospitals url: " + cat.vcahospitalsUrl
            binding.tempermentView.text = "Temperment: " + cat.temperament
            binding.originView.text = "Origin: " + cat.origin
            binding.countryCodeView.text = "CountryCode: " + cat.countryCode
            binding.descriptionView.text = "Description: " + cat.description
            binding.lifespanView.text = "Lifespan: " +cat.lifeSpan+ " years"
            binding.indoorView.text = "Indoor: " + cat.indoor
            binding.lapView.text = "Lap: " + cat.lap
            binding.altNamesView.text = "Alt names: " + cat.altNames
            binding.adaptabilityView.text = "adaptability: " + cat.adaptability
            binding.affectionLevelView.text = "Affection: " + cat.affectionLevel
            binding.childFriendlyView.text = "Child friendly: " + cat.childFriendly
            binding.dogFriendlyView.text = "Dog friendly: " + cat.dogFriendly
            binding.energyLevelView.text = "Energy level: " + cat.energyLevel
            binding.groomingView.text = "Grooming: " +cat.grooming
            binding.healthIssuesView.text = "Health Issues: " + cat.healthIssues
            binding.intelligenceView.text = "Intelligence: " + cat.intelligence
            binding.sheddingLevelView.text = "Shedding level: " + cat.shedding_level
            binding.socialNeedsView.text = "Social needs: " + cat.social_needs
            binding.strangerFriendlyView.text = "Stranger friendly: " + cat.dogFriendly
            binding.vocalisationView.text = "Vocalisation: " + cat.vocalisation
            binding.experimentalView.text = "Experimental: " + cat.experimental
            binding.hairlessView.text = "Hairless: " + cat.hairless
            binding.naturalView.text = "Natural: " + cat.natural
            binding.rareView.text = "Rare: " + cat.rare
            binding.rexView.text = "Rex: " + cat.rex
            binding.suppressedTailView.text = "Suppressed tail: " + cat.suppressedTail
            binding.shortLegsView.text = "Short legs: " + cat.shortLegs
            binding.wikipediaUrlView.text = "Wikipedia url: " + cat.wikipediaUrl
            binding.hypoallergenicView.text = "Hypoallergenic: " + cat.hypoallergenic


        }
    }
}