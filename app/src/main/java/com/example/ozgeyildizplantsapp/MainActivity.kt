package com.example.ozgeyildizplantsapp;

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.work.Data
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.example.ozgeyildizplantsapp.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private val workManager = WorkManager.getInstance(application)



    private lateinit var drawerLayout: DrawerLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val binding: ActivityMainBinding = DataBindingUtil.setContentView(
        //    this, R.layout.activity_main)


        setContentView(R.layout.activity_main)
        //val navView = findViewById<NavigationView>(R.id.navView)
        //val navHostFragment =
         //   supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment

        //drawerLayout = findViewById(R.id.drawerLayout)

        //NavigationUI.setupWithNavController(navView, navHostFragment.navController)


        //NavigationUI.setupActionBarWithNavController(this, navHostFragment.navController, drawerLayout)
        val recyclerView = findViewById<RecyclerView>(R.id.listRecycler)


        recyclerView.layoutManager = LinearLayoutManager(this)

        val citiesListAdapter = CitiesListAdapter(mutableListOf())
        recyclerView.adapter = citiesListAdapter
        var plants : MutableList<City> = mutableListOf()

        val cityObserver = Observer<List<City>> { cities ->
            citiesListAdapter.swapData(cities)
        }

        val plantsViewModel : PlantsDBViewModel by viewModels(){FlowerViewModelFactory(this.application)}
        plantsViewModel.fillPlantsPublic()
        plantsViewModel.fetch().observe(this, cityObserver)

        findViewById<Button>(R.id.loginButton).setOnClickListener {
            val intent = Intent(this, ActivityResultLauncher::class.java).apply {

            }
            startActivity(intent)
        }
    }





    val cities_json = "{}"
    val cities_boolean = false

    fun createInputData(): Data {

        val builder = Data.Builder()

        builder.putString("cities_json",cities_json).putBoolean("cities_boolean",cities_boolean)

        return builder.build()
    }

    private fun uploadCityWithInput() {
        val uploadRequest = OneTimeWorkRequestBuilder<MyWorker>().setInputData(createInputData()).build()
        workManager.enqueue(uploadRequest)
    }
    val data_json = {"Testing data"}

    //private fun downloadData() {
    //    workManager.enqueue(OneTimeWorkRequest.from(Upload))
    //}

}