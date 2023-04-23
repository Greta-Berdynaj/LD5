package com.example.movieappmad23.utils

import androidx.room.TypeConverter

class CustomConvertes {

    @TypeConverter
    fun listToString(value: List<String>) = value.joinToString(",")

    @TypeConverter
    fun stringToList(value: String) = value.split(",").map { it.trim() }
}