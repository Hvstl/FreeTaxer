package com.freetaxer.repositories

import com.freetaxer.database.CategoryDao
import com.freetaxer.models.Category

class CategoryRepository(private val dao: CategoryDao) {
    suspend fun insert(category: Category) = dao.insert(category)
    suspend fun update(category: Category) = dao.update(category)
    suspend fun delete(category: Category) = dao.delete(category)
    suspend fun getAll() = dao.getAll()
}

