package com.example.kotlin1dz4.api

import com.example.kotlin1dz4.model.Movie
import com.example.kotlin1dz4.utils.Constants.SHOWS_END_POINT
import retrofit2.Response
import retrofit2.http.GET

interface MovieApi {

    @GET(SHOWS_END_POINT)
    suspend fun getMovies(): Response<List<Movie>>
}