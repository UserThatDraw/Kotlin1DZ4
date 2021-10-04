package com.example.kotlin1dz4.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.kotlin1dz4.api.RetrofitClient
import com.example.kotlin1dz4.base.BaseViewModel
import com.example.kotlin1dz4.model.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieViewModel : BaseViewModel() {
    val moviesList = MutableLiveData<List<Movie>>()


    fun getMovie() {
        viewModelScope.launch(Dispatchers.IO) {
            RetrofitClient.apiService.getMovies().let {
                if (it.isSuccessful) {
                    moviesList.postValue(it.body())
                } else {
                    Log.e("anime", "movie Error ${it.code()}")
                }
            }
        }
    }
}










