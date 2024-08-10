package com.example.to_do_list_app.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo(
    @PrimaryKey
    val id: Int =0 ,
    val task : String ,
    val isImportant :Boolean
)
