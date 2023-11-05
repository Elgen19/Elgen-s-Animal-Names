package com.prestosa.animal.midterm


import android.annotation.SuppressLint
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.prestosa.animal.midterm.databinding.ActivityManageBlockBinding


class ManageBlockActivity : AppCompatActivity() {
    private lateinit var binding: ActivityManageBlockBinding
    private lateinit var sharedPreferences: SharedPreferences

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityManageBlockBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize SharedPreferences
        sharedPreferences = getSharedPreferences("BlockedAnimals", MODE_PRIVATE)

        // Retrieve the list of blocked animals
        val blockedAnimals = getBlockedAnimals().toList()

        // Set up the RecyclerView and its adapter
        val adapter = BlockedAnimalsAdapter(blockedAnimals)
        binding.blockedAnimalsRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.blockedAnimalsRecyclerView.adapter = adapter

        // Handle unblocking an animal using the adapter
        adapter.setOnUnblockClickListener { animalName ->
            unblockAnimal(animalName)
            adapter.notifyDataSetChanged()
        }
    }

    private fun getBlockedAnimals(): Set<String> {
        // Retrieve the set of blocked animals from SharedPreferences
        return sharedPreferences.getStringSet("blocked_animals", setOf()) ?: setOf()
    }

    private fun unblockAnimal(animalName: String) {
        // Implement the logic to unblock the animal here
        // You should remove the animal from the list in SharedPreferences
        val blockedAnimals = getBlockedAnimals().toMutableSet()
        blockedAnimals.remove(animalName)
        sharedPreferences.edit().putStringSet("blocked_animals", blockedAnimals).apply()
    }
}
