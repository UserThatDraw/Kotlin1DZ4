package com.example.kotlin1dz4.api

import com.example.kotlin1dz4.model.Movie
import com.example.kotlin1dz4.utils.Constants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private var retrofit: Retrofit? = null
    private fun getClient(baseUrl: String): Retrofit {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!
    }

    val apiService: MovieApi = getClient(BASE_URL).create(MovieApi::class.java)
}