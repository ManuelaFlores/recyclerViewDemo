package com.manuflowers.recyclerviewdemo.creatures_list.domain

import com.manuflowers.recyclerviewdemo.core.data.localDataSource.database.entity.CreatureEntity

class CreaturesListUsesCase(private val externalRepository: CreaturesRepository, private val localRepository : CreaturesRepository) {
    var externalCreaturesList = externalRepository.loadCreatureFromExternalFile()

    fun insertCreaturesInLocalDatabase() : List<CreatureEntity{
        for(creature in externalCreaturesList) {
            localRepository.insertCreatureInDataBase(creature)
        }
        return localRepository
    }
}