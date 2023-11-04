package br.borba.cleanmvvm.clean.presenter.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.borba.cleanmvvm.clean.presenter.model.CategoryUiModel
import br.borba.cleanmvvm.clean.presenter.viewmodel.MealViewModel
import br.borba.cleanmvvm.databinding.FragmentMealBinding
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class MealFragment : Fragment() {

    private val viewModel: MealViewModel by sharedViewModel()
    private lateinit var binding: FragmentMealBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMealBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getCategories()

        viewModel.categories.observe( viewLifecycleOwner) { listCategoryUiModel ->
            populateMealsCategory(listCategoryUiModel)
        }
    }

    private fun populateMealsCategory(categories: List<CategoryUiModel>) {

    }
}