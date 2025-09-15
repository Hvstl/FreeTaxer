package com.freetaxer.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.freetaxer.models.Expense
import com.freetaxer.repositories.ExpenseRepository
import kotlinx.coroutines.launch

class ExpenseViewModel(private val repository: ExpenseRepository) : ViewModel() {
    var expenses: List<Expense> = emptyList()
        private set

    fun loadExpenses() {
        viewModelScope.launch {
            expenses = repository.getAll()
        }
    }

    fun addExpense(expense: Expense) {
        viewModelScope.launch {
            repository.insert(expense)
            loadExpenses()
        }
    }

    fun updateExpense(expense: Expense) {
        viewModelScope.launch {
            repository.update(expense)
            loadExpenses()
        }
    }

    fun deleteExpense(expense: Expense) {
        viewModelScope.launch {
            repository.delete(expense)
            loadExpenses()
        }
    }
}

