package br.borba.cleanmvvm.domain

import br.borba.cleanmvvm.clean.domain.model.CategoryModel

object CategoryFactory {

    val categories = listOf(
        CategoryModel(
            "1",
            "Beef",
            "https://www.themealdb.com/images/category/beef.png",
            "Bla bla bla bla bla bla lorem ipsum"
        ),
        CategoryModel(
            "2",
            "Chicken",
            "https://www.themealdb.com/images/category/chicken.png",
            "Bla bla bla bla bla bla lorem ipsum"
        )
    )
}