package com.prestosa.animal.midterm

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prestosa.animal.midterm.databinding.RowLayoutBinding

class AnimalAdapter(private val itemList: List<AnimalDataModel>, private val onItemClick: (AnimalDataModel) -> Unit) :
    RecyclerView.Adapter<AnimalAdapter.MyViewHolder>() {

    data class AnimalDataModel(val name: String, val description: String)

    inner class MyViewHolder(private val binding: RowLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: AnimalDataModel) {
            with(binding) {
                animalNameTV.text = item.name
            }

            // Set a click listener for the entire row
            binding.root.setOnClickListener {
                onItemClick(item)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = RowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}
