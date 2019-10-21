package com.manuflowers.recyclerviewdemo.core.aplication

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.manuflowers.recyclerviewdemo.core.data.local.database.RecyclerViewDemoDatabase
import com.manuflowers.recyclerviewdemo.core.data.local.externalfiles.CreaturesStore

class RecyclerViewDemo: Application() {

    override fun onCreate() {
        instance = this
        super.onCreate()

        // Initialize CreatureStore
        CreaturesStore.loadCreatures(this)

        database =
            Room
                .databaseBuilder(
                    this,
                    RecyclerViewDemoDatabase::class.java,
                    "bodegapp_database"
                )
                .build()
    }

    companion object {
        lateinit var database: RecyclerViewDemoDatabase

        private lateinit var instance: RecyclerViewDemo

        fun getAppContext(): Context = instance.applicationContext
    }
}