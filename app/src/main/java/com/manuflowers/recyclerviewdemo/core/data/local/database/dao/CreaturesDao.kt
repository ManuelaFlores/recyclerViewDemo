package com.manuflowers.recyclerviewdemo.core.data.local.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.manuflowers.recyclerviewdemo.core.data.local.database.entity.CreatureEntity

@Dao
interface CreaturesDao {

    @Insert
    fun insertCreature(creatureEntityEntity: CreatureEntity)

    @Update
    fun updateCreature(creatureEntityEntity: CreatureEntity)

    @Delete
    fun deleteCreature(creatureEntityEntity: CreatureEntity)

    @Query("SELECT * FROM creatures_table ORDER BY id DESC")
    fun getAllProducts(): LiveData<List<CreatureEntity>>

}