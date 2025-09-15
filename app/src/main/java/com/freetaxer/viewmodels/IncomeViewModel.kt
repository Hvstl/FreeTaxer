package com.freetaxer.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.freetaxer.models.Income
import com.freetaxer.repositories.IncomeRepository
import kotlinx.coroutines.launch

class IncomeViewModel(private val repository: IncomeRepository) : ViewModel() {
    var incomes: List<Income> = emptyList()
        private set

    fun loadIncomes() {
        viewModelScope.launch {
            incomes = repository.getAll()
        }
    }

    fun addIncome(income: Income) {
        viewModelScope.launch {
            repository.insert(income)
            loadIncomes()
        }
    }

    fun updateIncome(income: Income) {
        viewModelScope.launch {
            repository.update(income)
            loadIncomes()
        }
    }

    fun deleteIncome(income: Income) {
        viewModelScope.launch {
            repository.delete(income)
            loadIncomes()
        }
    }
}

