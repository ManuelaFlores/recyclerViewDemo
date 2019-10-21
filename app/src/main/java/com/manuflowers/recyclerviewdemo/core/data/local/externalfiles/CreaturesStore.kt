package com.manuflowers.recyclerviewdemo.core.data.local.externalfiles

import android.content.Context
import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.manuflowers.recyclerviewdemo.core.data.local.database.entity.CreatureEntity
import java.io.IOException

object CreaturesStore {
    private const val TAG = "CreatureStore"

    private lateinit var creatureEntities: List<CreatureEntity>

    fun loadCreatures(context: Context) {
        val gson = Gson()
        val json = loadJSONFromAsset("creatures.json", context)
        val listType = object : TypeToken<List<CreatureEntity>>() {}.type
        creatureEntities = gson.fromJson(json, listType)

        Log.v(TAG, "Found ${creatureEntities.size} creatureEntities")
    }

    fun getCreatures() = creatureEntities

    fun getCreatureById(id: Int) = creatureEntities.firstOrNull { it.id == id }

    private fun loadJSONFromAsset(filename: String, context: Context): String? {
        var json: String? = null
        try {
            val inputStream = context.assets.open(filename)
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            json = String(buffer)
        } catch (ex: IOException) {
            Log.e(TAG, "Error reading from $filename", ex)
        }
        return json
    }
}