package com.freetaxer.database

import androidx.room.*
import com.freetaxer.models.Expense

@Dao
interface ExpenseDao {
    @Insert
    suspend fun insert(expense: Expense)

    @Update
    suspend fun update(expense: Expense)

    @Delete
    suspend fun delete(expense: Expense)

    @Query("SELECT * FROM Expense")
    suspend fun getAll(): List<Expense>
}

