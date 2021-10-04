package com.example.kotlin1dz4.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.kotlin1dz4.databinding.MovieItemBinding
import com.example.kotlin1dz4.model.Movie

class MovieAdapter(private var list: List<Movie>) :
    RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: MovieItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: Movie) {
            binding.itemTxt.text = model.name
            binding.itemIv.load(model.image.original) {
                crossfade(true)
                crossfade(1000)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            MovieItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.onBind(list[position])

    override fun getItemCount(): Int = list.size
}










