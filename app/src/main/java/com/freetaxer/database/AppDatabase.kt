package com.freetaxer.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.freetaxer.models.Income
import com.freetaxer.models.Expense
import com.freetaxer.models.Category
import com.freetaxer.models.User

@Database(entities = [Income::class, Expense::class, Category::class, User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun incomeDao(): IncomeDao
    abstract fun expenseDao(): ExpenseDao
    abstract fun categoryDao(): CategoryDao
    abstract fun userDao(): UserDao
}

