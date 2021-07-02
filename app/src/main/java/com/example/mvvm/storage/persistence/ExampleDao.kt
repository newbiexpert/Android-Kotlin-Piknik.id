package com.example.mvvm.storage.persistence

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ExampleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(exampleEntity: ExampleEntity)

    @Update
    suspend fun update(exampleEntity: ExampleEntity)

    @Delete
    suspend fun delete(exampleEntity: ExampleEntity)

    @Query("SELECT * FROM tableExample")
    fun select(): LiveData<List<ExampleEntity>>
}