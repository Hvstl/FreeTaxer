package com.freetaxer.database

import androidx.room.*
import com.freetaxer.models.User

@Dao
interface UserDao {
    @Insert
    suspend fun insert(user: User)

    @Update
    suspend fun update(user: User)

    @Delete
    suspend fun delete(user: User)

    @Query("SELECT * FROM User WHERE username = :username")
    suspend fun getUser(username: String): User?
}

