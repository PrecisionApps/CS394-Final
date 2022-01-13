package com.example.ozgeyildizplantsapp;

import android.app.Application
import androidx.lifecycle.*
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.launch
import java.lang.IllegalArgumentException

class PlantsDBViewModel(application: Application) : AndroidViewModel(application) {


    val theApp = application
    private var cityDao : CityDao

    init{
        cityDao = CityDatabase.getInstance(application).cityDao
    }

    fun fetch(): LiveData<List<City>> {
        return cityDao.getAll()
    }

    fun fillPlantsPublic() {
        viewModelScope.launch {
            cityDao.deleteAll()
            fillPlants()
        }
    }
    private suspend fun fillPlants() {

        val jsonString = theApp.resources.openRawResource(R.raw.citiesjson).bufferedReader().use {
            it.readText()
        }

        val typeToken = object : TypeToken<List<City>>() {}.type
        val cities = Gson().fromJson<List<City>>(jsonString, typeToken)

        cityDao.insertAll(cities)
    }




}

class FlowerViewModelFactory(private val application: Application): ViewModelProvider.Factory {
    override fun <T: ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PlantsDBViewModel::class.java)) {
            return PlantsDBViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }
}