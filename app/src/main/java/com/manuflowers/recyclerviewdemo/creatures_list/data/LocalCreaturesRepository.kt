package com.manuflowers.recyclerviewdemo.creatures_list.data

import com.manuflowers.recyclerviewdemo.core.data.localDataSource.database.dao.CreaturesDao
import com.manuflowers.recyclerviewdemo.core.data.localDataSource.database.entity.CreatureEntity
import com.manuflowers.recyclerviewdemo.creatures_list.domain.CreaturesRepository

class LocalCreaturesRepository(private val creaturesDao: CreaturesDao): CreaturesRepository {
    override fun loadCreatureFromExternalFile(): List<CreatureEntity> {
        return  creaturesDao.getAllCreatures()
    }
}