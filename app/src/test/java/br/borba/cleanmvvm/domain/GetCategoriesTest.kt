package br.borba.cleanmvvm.domain

import br.borba.cleanmvvm.clean.data.GetCategoriesException
import br.borba.cleanmvvm.clean.data.MealRepository
import br.borba.cleanmvvm.clean.domain.GetCategories
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

class GetCategoriesTest {

    private val repository = mockk<MealRepository>()
    private val getCategories = GetCategories(repository)

    @Test
    fun getCategories_return_list_with_success() = runBlocking {
        // given
        coEvery { repository.getCategories() } returns CategoryFactory.categories

        // when
        val result = getCategories()

        // then
        Assert.assertEquals(result.size, CategoryFactory.categories.size)
    }

    @Test
    fun getCategories_return_list_with_error() = runBlocking {
        // given
        coEvery { repository.getCategories() } throws GetCategoriesException()

        // when
        val result = getCategories()

        // then
        Assert.assertEquals(result.size, 0)
    }
}