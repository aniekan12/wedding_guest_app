package com.ani.weddingguestapp.data.view_models.home_view_model.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ani.weddingguestapp.data.view_models.home_view_model.HomeViewModel
import com.ani.weddingguestapp.domain.repositories.home.HomeRepository

class HomeViewModelFactory: ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val repository = HomeRepository()
        return HomeViewModel(repository = repository) as T
    }

}