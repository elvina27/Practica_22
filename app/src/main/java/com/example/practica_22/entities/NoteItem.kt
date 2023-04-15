package com.example.practica_22.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "NoteItem")
data class NoteItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,

    @ColumnInfo(name = "title")
    val name: String?,

    @ColumnInfo(name = "content")
    val itemInfo: String,

    @ColumnInfo(name = "time")
    val itemChecked: String,

    @ColumnInfo(name = "category")
    val listId: String
)