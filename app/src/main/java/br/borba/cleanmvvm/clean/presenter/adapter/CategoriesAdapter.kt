package br.borba.cleanmvvm.clean.presenter.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.borba.cleanmvvm.clean.presenter.model.CategoryUiModel
import br.borba.cleanmvvm.databinding.ItemCategoryBinding

class CategoriesAdapter(
    private val categories: List<CategoryUiModel>
) : RecyclerView.Adapter<CategoriesAdapter.CategoriesViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoriesAdapter.CategoriesViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CategoriesAdapter.CategoriesViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class CategoriesViewHolder(val binding: ItemCategoryBinding) :
        RecyclerView.ViewHolder(binding.root)

}