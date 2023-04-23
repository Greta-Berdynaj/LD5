package com.example.movieappmad23.utils

import android.content.Context
import androidx.compose.ui.platform.LocalContext
import com.example.movieappmad23.MovieViewModelFactory
import com.example.movieappmad23.data.MovieDatabase
import com.example.movieappmad23.repositories.MovieRepository

object InjectorUtils {
    private fun getMovieRepository(context: Context): MovieRepository{
        return MovieRepository(MovieDatabase.getDatabase(context).movieDao())
    }
    fun provideMovieViewModelFactory(context: Context): MovieViewModelFactory {
        val repository = getMovieRepository(context)
        return MovieViewModelFactory(repository)
    }
}