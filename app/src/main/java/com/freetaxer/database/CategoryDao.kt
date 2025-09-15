package com.freetaxer.database

import androidx.room.*
import com.freetaxer.models.Category

@Dao
interface CategoryDao {
    @Insert
    suspend fun insert(category: Category)

    @Update
    suspend fun update(category: Category)

    @Delete
    suspend fun delete(category: Category)

    @Query("SELECT * FROM Category")
    suspend fun getAll(): List<Category>
}

