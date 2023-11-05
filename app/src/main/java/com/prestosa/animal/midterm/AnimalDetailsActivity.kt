package com.prestosa.animal.midterm


import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.prestosa.animal.midterm.databinding.ActivityAnimalDetailsBinding


class AnimalDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAnimalDetailsBinding
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimalDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animalName = intent.getStringExtra("NAME_PARAMS")
        val animalDescription = intent.getStringExtra("DESCRIPTION_PARAMS")

        binding.detailAnimalNameTV.text = animalName
        binding.detailAnimalDescriptionTV.text = animalDescription

        // Initialize SharedPreferences
        sharedPreferences = getSharedPreferences("BlockedAnimals", MODE_PRIVATE)

        // Add a "Block Animal" button
        binding.detailBlockAnimalB.setOnClickListener {
            animalName?.let {
                blockAnimal(it) // Call blockAnimal only if animalName is not null
            }
            finish() // Close the activity and return to AnimalNamesActivity
        }

    }

    private fun blockAnimal(animalName: String) {
        // Implement the logic to block the animal here
        // You should store the blocked animal in SharedPreferences
        // and update the list in AnimalNamesActivity
        val blockedAnimals = getBlockedAnimals().toMutableSet()
        blockedAnimals.add(animalName)
        sharedPreferences.edit().putStringSet("blocked_animals", blockedAnimals).apply()
    }


    private fun getBlockedAnimals(): Set<String> {
        // Retrieve the set of blocked animals from SharedPreferences
        return sharedPreferences.getStringSet("blocked_animals", setOf()) ?: setOf()
    }
}
