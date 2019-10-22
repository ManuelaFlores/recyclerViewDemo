package com.manuflowers.recyclerviewdemo.creatures_list.data

import com.manuflowers.recyclerviewdemo.core.data.localDataSource.database.entity.CreatureEntity
import com.manuflowers.recyclerviewdemo.core.data.externalDataSource.CreaturesStore
import com.manuflowers.recyclerviewdemo.creatures_list.domain.CreaturesRepository

class ExternalCreaturesRepository : CreaturesRepository {
    override fun loadCreatureFromExternalFile(): List<CreatureEntity> {
        return CreaturesStore.getAllCreatures()
    }

    override fun insertCreatureInDataBase(creatureEntity: CreatureEntity) {

    }

}