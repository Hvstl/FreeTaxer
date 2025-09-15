package com.freetaxer.repositories

import com.freetaxer.database.UserDao
import com.freetaxer.models.User

class UserRepository(private val dao: UserDao) {
    suspend fun insert(user: User) = dao.insert(user)
    suspend fun update(user: User) = dao.update(user)
    suspend fun delete(user: User) = dao.delete(user)
    suspend fun getUser(username: String) = dao.getUser(username)
}

