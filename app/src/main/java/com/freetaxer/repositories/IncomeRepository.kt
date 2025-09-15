package com.freetaxer.repositories

import com.freetaxer.database.IncomeDao
import com.freetaxer.models.Income

class IncomeRepository(private val dao: IncomeDao) {
    suspend fun insert(income: Income) = dao.insert(income)
    suspend fun update(income: Income) = dao.update(income)
    suspend fun delete(income: Income) = dao.delete(income)
    suspend fun getAll() = dao.getAll()
}

