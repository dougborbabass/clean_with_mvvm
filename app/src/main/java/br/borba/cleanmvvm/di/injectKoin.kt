package br.borba.cleanmvvm.di

import br.borba.cleanmvvm.clean.data.MealRepository
import br.borba.cleanmvvm.clean.data.MealRepositoryImpl
import br.borba.cleanmvvm.clean.data.api.MealApi
import br.borba.cleanmvvm.clean.domain.GetCategories
import br.borba.cleanmvvm.clean.domain.GetCategoriesUseCase
import br.borba.cleanmvvm.clean.presenter.viewmodel.MealViewModel
import br.borba.cleanmvvm.network.ServiceMeal
import org.koin.dsl.module

val mealServiceModule = module {
    single { ServiceMeal().createService(MealApi::class.java) }
    single<MealRepository> { MealRepositoryImpl(get()) }
    single<GetCategoriesUseCase> { GetCategories(get()) }
    single { MealViewModel(get()) }
}