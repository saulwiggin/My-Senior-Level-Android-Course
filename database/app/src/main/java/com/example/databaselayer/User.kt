package com.example.databaselayer

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// This is a model Entity defining a user in an application
// define data using a entity https://developer.android.com/training/data-storage/room/defining-data
@Entity
data class User(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "first_name") val firstName: String?,
    @ColumnInfo(name = "last_name") val lastName: String?
    )
