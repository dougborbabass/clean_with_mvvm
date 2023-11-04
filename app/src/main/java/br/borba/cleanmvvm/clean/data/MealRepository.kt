package br.borba.cleanmvvm.clean.data

import br.borba.cleanmvvm.clean.data.api.MealApi
import br.borba.cleanmvvm.clean.data.model.toCategory
import br.borba.cleanmvvm.clean.domain.model.CategoryModel
import br.borba.cleanmvvm.network.Output
import br.borba.cleanmvvm.network.parseResponse

class MealRepositoryImpl(
    private val service: MealApi
) : MealRepository {

    override suspend fun getCategories(): List<CategoryModel> {

        val result = service.getCategories().parseResponse()

        return when (result) {
            is Output.Success -> {
                val categoryResponseList = result.value.categories

                categoryResponseList.map {
                    it.toCategory()
                }
            }
            is Output.Failure -> throw GetCategoriesException()
        }
    }
}

interface MealRepository {
    suspend fun getCategories(): List<CategoryModel>
}

class GetCategoriesException : Exception()