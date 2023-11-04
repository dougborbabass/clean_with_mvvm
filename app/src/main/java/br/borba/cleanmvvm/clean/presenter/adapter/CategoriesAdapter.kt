package br.borba.cleanmvvm.clean.presenter.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.borba.cleanmvvm.clean.presenter.model.CategoryUiModel
import br.borba.cleanmvvm.databinding.ItemCategoryBinding
import coil.load

class CategoriesAdapter(
    private val categories: List<CategoryUiModel>
) : RecyclerView.Adapter<CategoriesAdapter.CategoriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesAdapter.CategoriesViewHolder {
        val itemView =
            ItemCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoriesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CategoriesAdapter.CategoriesViewHolder, position: Int) {
        val category = categories[position]

        with(holder) {
            binding.tvMeal.text = category.name
            binding.ivMeal.load(category.thumb)
        }
    }

    override fun getItemCount() = categories.size

    inner class CategoriesViewHolder(val binding: ItemCategoryBinding) :
        RecyclerView.ViewHolder(binding.root)

}