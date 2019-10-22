package com.manuflowers.recyclerviewdemo.creatures_list.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.manuflowers.recyclerviewdemo.core.data.localDataSource.database.entity.CreatureEntity
import com.manuflowers.recyclerviewdemo.creatures_list.data.ExternalCreaturesRepository
import com.manuflowers.recyclerviewdemo.creatures_list.domain.CreaturesListUsesCase

class CreaturesListViewModel(private val creaturesListUsesCase: CreaturesListUsesCase) {

    val creaturesListMutableLiveData = MutableLiveData<MutableList<CreatureEntity>>()

    fun getAllCreatures() : LiveData<MutableList<CreatureEntity>> {
        val creaturesList =
    }
}