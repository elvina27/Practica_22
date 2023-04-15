package com.example.practica_22.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.practica_22.entities.LibraryItem
import com.example.practica_22.entities.NoteItem
import com.example.practica_22.entities.ShoppingListItem
import com.example.practica_22.entities.ShoppingListName


@Database(
    entities = [
        LibraryItem::class,
    NoteItem::class,
    ShoppingListItem::class,
    ShoppingListName::class
    ],
    version = 1
)

abstract class MainDataBase : RoomDatabase() {
    companion object {
        @Volatile
        private var INSTANCE: MainDataBase? = null

        fun getDataBase(context: Context): MainDataBase{
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                MainDataBase::class.java,
                "shopping_list.db"
                ).build()
                instance
            }
        }
    }
}