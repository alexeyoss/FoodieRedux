package ru.alexeyoss.foodie.presentation.dishes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import ru.alexeyoss.foodie.databinding.FragmentDishDetailsDialogBinding

@AndroidEntryPoint
class DishDetailsDialogFragment : Fragment() {

    private var binding: FragmentDishDetailsDialogBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentDishDetailsDialogBinding.inflate(layoutInflater, container, false)
        this.binding = binding
        return binding.root
    }

}