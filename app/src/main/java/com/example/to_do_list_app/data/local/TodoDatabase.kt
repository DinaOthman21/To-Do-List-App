package com.example.to_do_list_app.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.to_do_list_app.domain.model.Todo

@Database(entities = [Todo::class], version = 1 , exportSchema = false)
abstract class TodoDatabase : RoomDatabase() {
    abstract fun todoDao(): TodoDao
}