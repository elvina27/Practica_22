package com.example.practica_22.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopping_list_name")
data class ShoppingListName(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "time")
    val time: String,

    @ColumnInfo(name = "allItemCount")
    val allItemCount: Int,

    @ColumnInfo(name = "checkedItemCounter")
    val checkedItemCounter: Int,

    @ColumnInfo(name = "itemsId")
    val itemsId: String
) : java.io.Serializable
