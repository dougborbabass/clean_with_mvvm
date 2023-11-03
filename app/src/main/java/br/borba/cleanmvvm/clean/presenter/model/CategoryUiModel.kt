package br.borba.cleanmvvm.clean.presenter.model

import br.borba.cleanmvvm.clean.domain.model.CategoryModel

class CategoryUiModel(
    val name: String,
    val thumb: String
)

fun CategoryModel.toUiModel() = CategoryUiModel(
    name = this.name,
    thumb = this.thumb
)

