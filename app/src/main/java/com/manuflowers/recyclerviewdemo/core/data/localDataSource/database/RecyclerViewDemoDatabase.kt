package com.manuflowers.recyclerviewdemo.core.data.localDataSource.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.manuflowers.recyclerviewdemo.core.data.localDataSource.database.dao.CreaturesDao
import com.manuflowers.recyclerviewdemo.core.data.localDataSource.database.entity.CreatureEntity

@Database(
    entities = [CreatureEntity::class],
    version = 1,
    exportSchema = false
)
abstract class RecyclerViewDemoDatabase : RoomDatabase() {
    abstract fun creaturesDao(): CreaturesDao
}