package com.example.ozgeyildizplantsapp;


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "cityDatabase")
data class City(
        @PrimaryKey(autoGenerate = true)
        var id: Long = 0L,

        @ColumnInfo(name = "zipCode")
        var zipCode: String,

        @ColumnInfo(name = "cityName")
        val cityName: String,



        var imageURL: String,

        ) : Serializable