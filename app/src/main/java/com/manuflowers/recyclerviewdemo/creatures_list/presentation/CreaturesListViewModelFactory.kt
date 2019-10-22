package com.manuflowers.recyclerviewdemo.creatures_list.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.manuflowers.recyclerviewdemo.creatures_list.data.ExternalCreaturesRepository

class CreaturesListViewModelFactory(private val externalCreaturesRepository: ExternalCreaturesRepository) :
    ViewModelProvider.Factory {
    override fun <CustomCreaturesListViewModel : ViewModel?> create(modelClass: Class<CustomCreaturesListViewModel>): CustomCreaturesListViewModel {
        return CreaturesListViewModel(externalCreaturesRepository) as CustomCreaturesListViewModel
    }
}