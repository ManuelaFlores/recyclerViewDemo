package com.manuflowers.recyclerviewdemo.core.data.localDataSource.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "creatures_table")
data class CreatureEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val firstName: String,
    val lastName: String,
    val nickname: String,
    val image: String,
    val planet: String
) : Serializable {

    val fullName: String
        get() = "$firstName $lastName"

    val uri: String
        get() = "drawable/$image"

    val thumbnail: String
        get() = "drawable/thumbnail_$image"
}