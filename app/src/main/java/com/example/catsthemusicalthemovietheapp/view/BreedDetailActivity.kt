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
            binding.nameView.text = cat.name
            binding.cfaView.text = "CFA url: " + cat.cfaUrl
            binding.vetstreetView.text = "Vetstreet url: " + cat.vetstreetUrl
            binding.vcaView.text = "VCA hospitals url: " + cat.vcahospitalsUrl
            binding.tempermentView.text = "Temperment: " + cat.temperament
            binding.originView.text = "Origin: " + cat.origin
            binding.countryCodeView.text = "CountryCode: " + cat.countryCode
            binding.descriptionView.text = cat.description
            binding.lifespanView.text = "Lifespan: " +cat.lifeSpan+ " years"
            binding.indoorView.text = "Indoor: " + (cat.indoor != 0)
            binding.lapView.text = "Lap: " + (cat.lap !=0)
            binding.altNamesView.text = "Alt names: " + cat.altNames
            binding.adaptabilityView.text = "adaptability: " + cat.adaptability +"/5"
            binding.affectionLevelView.text = "Affection: " + cat.affectionLevel +"/5"
            binding.childFriendlyView.text = "Child friendly: " + cat.childFriendly +"/5"
            binding.dogFriendlyView.text = "Dog friendly: " + cat.dogFriendly +"/5"
            binding.energyLevelView.text = "Energy level: " + cat.energyLevel +"/5"
            binding.groomingView.text = "Grooming: " +cat.grooming +"/5"
            binding.healthIssuesView.text = "Health Issues: " + cat.healthIssues +"/5"
            binding.intelligenceView.text = "Intelligence: " + cat.intelligence +"/5"
            binding.sheddingLevelView.text = "Shedding level: " + cat.shedding_level +"/5"
            binding.socialNeedsView.text = "Social needs: " + cat.social_needs +"/5"
            binding.strangerFriendlyView.text = "Stranger friendly: " + cat.dogFriendly +"/5"
            binding.vocalisationView.text = "Vocalisation: " + cat.vocalisation +"/5"
            binding.experimentalView.text = "Experimental: " + (cat.experimental !=0)
            binding.hairlessView.text = "Hairless: " + (cat.hairless !=0)
            binding.naturalView.text = "Natural: " + (cat.natural !=0)
            binding.rareView.text = "Rare: " + (cat.rare !=0)
            binding.rexView.text = "Rex: " + (cat.rex !=0)
            binding.suppressedTailView.text = "Suppressed tail: " + (cat.suppressedTail !=0)
            binding.shortLegsView.text = "Short legs: " + (cat.shortLegs !=0)
            binding.wikipediaUrlView.text = "Wikipedia url: " + cat.wikipediaUrl
            binding.hypoallergenicView.text = "Hypoallergenic: " + (cat.hypoallergenic != 0)
        }
    }
}