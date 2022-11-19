package com.example.databaselayer

import androidx.room.Database
import androidx.room.RoomDatabase

// the app database must be annotate with @database, must be an abstract class that extends room database
// and for each DAO the database class must define an abstract method which returns an instance of the DAO class

@Database(entities = [User::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
     abstract fun userDao(): UserDao
}

