package br.borba.cleanmvvm.clean.data.api

import br.borba.cleanmvvm.clean.data.model.CategoryResponse
import br.borba.cleanmvvm.network.BaseResponse
import retrofit2.Response
import retrofit2.http.GET

interface MealApi {
    @GET("categories.php")
    suspend fun getCategories(): Response<BaseResponse<CategoryResponse>>
}