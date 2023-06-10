package ru.alexeyoss.foodie.data.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CategoryList(
    val categories: ArrayList<CategoryDTO>
) : Parcelable