package com.freetaxer.database

import androidx.room.*

import com.freetaxer.models.Income

@Dao
interface IncomeDao {
    @Insert
    suspend fun insert(income: Income)

    @Update
    suspend fun update(income: Income)

    @Delete
    suspend fun delete(income: Income)

    @Query("SELECT * FROM Income")
    suspend fun getAll(): List<Income>
}

