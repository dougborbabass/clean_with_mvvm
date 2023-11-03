package br.borba.cleanmvvm.clean.data.model

import br.borba.cleanmvvm.clean.domain.model.CategoryModel

data class CategoryResponse(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
)

fun CategoryResponse.toCategory() = CategoryModel (
    id = this.idCategory,
    name = this.strCategory,
    thumb = this.strCategoryThumb,
    description = this.strCategoryDescription
)