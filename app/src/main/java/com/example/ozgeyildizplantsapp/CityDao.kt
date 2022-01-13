package com.example.ozgeyildizplantsapp;


import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface CityDao {

    @Insert
    suspend fun insert(plant: City)

    @Insert
    suspend fun insertAll(plants: List<City>)

    @Query("DELETE FROM cityDatabase")
    suspend fun deleteAll()

    @Query("SELECT * from cityDatabase WHERE id = :key")
    suspend fun get(key: Long): City?

    @Query("SELECT * FROM cityDatabase ORDER BY id DESC LIMIT 1")
    suspend fun getLast(): City?

    @Query("SELECT * FROM cityDatabase")
    fun getAll(): LiveData<List<City>>


}