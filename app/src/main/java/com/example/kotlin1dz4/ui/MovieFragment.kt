package com.example.kotlin1dz4.ui

import android.util.Log
import androidx.fragment.app.viewModels
import com.example.kotlin1dz4.base.BaseFragment
import com.example.kotlin1dz4.databinding.FragmentMovieBinding
import com.example.kotlin1dz4.ui.adapter.MovieAdapter

class MovieFragment() : BaseFragment<FragmentMovieBinding>(FragmentMovieBinding::inflate) {

    private val viewModel: MovieViewModel by viewModels()

    override fun initM() {
        viewModel.moviesList.observe(viewLifecycleOwner, {
            binding.movieRec.adapter = MovieAdapter(it)
        })
    }

    override fun setupView() {
        viewModel.getMovie()
    }
}