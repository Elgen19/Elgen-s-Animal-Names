package com.prestosa.animal.midterm


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prestosa.animal.midterm.databinding.BlockedRowLayoutBinding


class BlockedAnimalsAdapter(private val blockedAnimals: List<String>) :
    RecyclerView.Adapter<BlockedAnimalsAdapter.ViewHolder>() {

    class ViewHolder(private val binding: BlockedRowLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(animalName: String, onUnblockClick: (String) -> Unit) {
            binding.animalNameTV.text = animalName
            binding.unblockB.setOnClickListener {
                onUnblockClick(animalName)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = BlockedRowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val animalName = blockedAnimals[position]
        holder.bind(animalName, onUnblockClick)
    }

    override fun getItemCount(): Int {
        return blockedAnimals.size
    }

    private var onUnblockClick: (String) -> Unit = {}

    fun setOnUnblockClickListener(listener: (String) -> Unit) {
        onUnblockClick = listener
    }
}
