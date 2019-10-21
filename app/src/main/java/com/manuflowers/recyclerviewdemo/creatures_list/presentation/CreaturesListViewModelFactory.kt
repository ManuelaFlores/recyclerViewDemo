package com.manuflowers.recyclerviewdemo.creatures_list.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.manuflowers.recyclerviewdemo.creatures_list.data.CreaturesListRepository

class CreaturesListViewModelFactory(private val creaturesListRepository: CreaturesListRepository) :
    ViewModelProvider.Factory {
    override fun <CustomCreaturesListViewModel : ViewModel?> create(modelClass: Class<CustomCreaturesListViewModel>): CustomCreaturesListViewModel {
        return CreaturesListViewModel(creaturesListRepository) as CustomCreaturesListViewModel
    }
}