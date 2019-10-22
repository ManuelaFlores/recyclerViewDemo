package com.manuflowers.recyclerviewdemo.creatures_list.domain

import com.manuflowers.recyclerviewdemo.core.data.localDataSource.database.entity.CreatureEntity

interface CreaturesRepository {
    fun loadCreatureFromExternalFile() : List<CreatureEntity>
}