package com.example.movieappmad23.data

import androidx.room.*
import com.example.movieappmad23.models.Movie
import kotlinx.coroutines.flow.Flow

@Dao
interface MovieDao {
    // CRUD
    @Insert
    suspend fun add(movie: Movie)

    @Update
    suspend fun update(movie: Movie)

    @Delete
    suspend fun delete(movie: Movie)

    @Query("SELECT * from movie")
    suspend fun readAll(): Flow<List<Movie>>

    @Query("SELECT * from movie where isFavorite = 1")
    fun readAllChecked(): Flow<List<Movie>>

    @Query("SELECT * from movie where id=:movieID")
    suspend fun getMovieById(movieID: Int): Movie

    @Query("DELETE from movie")
    suspend fun deleteAll()

}