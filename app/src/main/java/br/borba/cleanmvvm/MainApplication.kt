package br.borba.cleanmvvm

import android.app.Application
import br.borba.cleanmvvm.di.mealServiceModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MealApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MealApplication)
            modules(listOf(mealServiceModule))
        }
    }
}
