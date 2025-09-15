package com.freetaxer.repositories

import com.freetaxer.database.ExpenseDao
import com.freetaxer.models.Expense

class ExpenseRepository(private val dao: ExpenseDao) {
    suspend fun insert(expense: Expense) = dao.insert(expense)
    suspend fun update(expense: Expense) = dao.update(expense)
    suspend fun delete(expense: Expense) = dao.delete(expense)
    suspend fun getAll() = dao.getAll()
}

