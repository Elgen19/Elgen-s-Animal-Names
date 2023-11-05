package com.prestosa.animal.midterm

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.prestosa.animal.midterm.databinding.ActivityAnimalNamesBinding

class AnimalNamesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAnimalNamesBinding
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var viewModel: AnimalRepos

    // Define animalList as a class-level property
    private val animalList = mutableListOf<AnimalAdapter.AnimalDataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimalNamesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize SharedPreferences
        sharedPreferences = getSharedPreferences("BlockedAnimals", MODE_PRIVATE)

        viewModel = ViewModelProvider(this)[AnimalRepos::class.java]

        // Set up the initial animalList
        animalList.addAll(viewModel.getAnimalList())

        val adapter = AnimalAdapter(animalList, ::onItemClick)

        with(binding.recyclerView) {
            layoutManager = LinearLayoutManager(this@AnimalNamesActivity)
            addItemDecoration(DividerItemDecoration(this@AnimalNamesActivity, LinearLayoutManager.HORIZONTAL))
            this.adapter = adapter
        }

        // Set up the "Manage Block Animals" button click listener
        binding.manageBlockAnimalsB.setOnClickListener {
            val intent = Intent(this, ManageBlockActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        // Refresh the animal list based on the current block status
        refreshAnimalList()
    }

    private fun onItemClick(item: AnimalAdapter.AnimalDataModel) {
        // Handle the item click here
        val intent = Intent(this, AnimalDetailsActivity::class.java).apply {
            putExtra("NAME_PARAMS", item.name)
            putExtra("DESCRIPTION_PARAMS", item.description)
        }
        startActivity(intent)
    }

    private fun refreshAnimalList() {
        val blockedAnimals = getBlockedAnimals()
        val filteredAnimalList = animalList.filter { animal ->
            animal.name !in blockedAnimals
        }

        val adapter = AnimalAdapter(filteredAnimalList, ::onItemClick)
        binding.recyclerView.adapter = adapter
    }

    private fun getBlockedAnimals(): Set<String> {
        // Retrieve the set of blocked animals from SharedPreferences
        return sharedPreferences.getStringSet("blocked_animals", setOf()) ?: setOf()
    }
}
