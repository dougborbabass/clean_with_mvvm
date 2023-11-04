package br.borba.cleanmvvm.clean.presenter.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.borba.cleanmvvm.clean.domain.GetCategoriesUseCase
import br.borba.cleanmvvm.clean.presenter.model.CategoryUiModel
import br.borba.cleanmvvm.clean.presenter.model.toUiModel
import kotlinx.coroutines.launch

class MealViewModel(
    private val getCategoriesUseCase: GetCategoriesUseCase
) : ViewModel() {

    private val _categories = MutableLiveData<List<CategoryUiModel>>()
    val categories = _categories as LiveData<List<CategoryUiModel>>

    fun getCategories() {
        viewModelScope.launch {
            val categoryList = getCategoriesUseCase()

            _categories.value = categoryList.map { category ->
                category.toUiModel()
            }
        }
    }
}

