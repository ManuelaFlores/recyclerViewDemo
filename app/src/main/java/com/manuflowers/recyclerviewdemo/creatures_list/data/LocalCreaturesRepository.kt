package com.manuflowers.recyclerviewdemo.creatures_list.data

import android.os.AsyncTask
import com.manuflowers.recyclerviewdemo.core.data.localDataSource.database.dao.CreaturesDao
import com.manuflowers.recyclerviewdemo.core.data.localDataSource.database.entity.CreatureEntity
import com.manuflowers.recyclerviewdemo.creatures_list.domain.CreaturesRepository

class LocalCreaturesRepository(private val creaturesDao: CreaturesDao): CreaturesRepository {

    override fun loadCreatureFromExternalFile(): List<CreatureEntity> {
        return  creaturesDao.getAllCreatures()
    }

    override fun insertCreatureInDataBase(creatureEntity: CreatureEntity) {
        InsertAsyncTask(creaturesDao).execute(creatureEntity)
    }

    private class InsertAsyncTask internal constructor(private val creaturesDao: CreaturesDao) :
        AsyncTask<CreatureEntity, Void, Void>() {
        override fun doInBackground(vararg creatureEntity: CreatureEntity): Void? {
            creaturesDao.insertCreature(creatureEntity[0])
            return null
        }
    }
}