package ru.alexeyoss.features.dishes.presentation.dishes

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineExceptionHandler
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class DishesViewModel
@Inject
constructor(
//    @CoroutinesModule.IoDispatcher
    private val ioDispatcher: CoroutineDispatcher,
) : ViewModel() {

    private val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        Timber.i(throwable)
    }

    fun getCategoryDishes() {

    }
}