package com.example.databaselayer

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

// the following code defines the DAO providing the methods that the rest of the app u
// ses to interact with data in the user table
// Accessing data using Room DAOs https://developer.android.com/training/data-storage/room/accessing-data
@Dao
interface UserDao {
    @Query("Select * FROM user")
    fun getAll(): List<User>

    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<User>

    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
    "last_name LIKE :last LIMIT 1")
    fun findbyName(first:String, last: String): User

    @Insert
    fun insertAll(vararg users: User)

    @Delete
    fun delete(user: User)
}