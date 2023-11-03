package br.borba.cleanmvvm.clean.domain

import br.borba.cleanmvvm.clean.data.MealRepository
import br.borba.cleanmvvm.clean.domain.model.CategoryModel

class GetCategories(
    private val mealRepository: MealRepository
): GetCategoriesUseCase {
    override suspend fun invoke(): List<CategoryModel> = try {
        mealRepository.getCategories()
    } catch (ex: Exception) {
        listOf()
    }
}

interface GetCategoriesUseCase {
    suspend operator fun invoke(): List<CategoryModel>
}