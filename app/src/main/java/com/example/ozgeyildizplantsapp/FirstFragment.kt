package com.example.ozgeyildizplantsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ozgeyildizplantsapp.databinding.FragmentFirstBinding
import androidx.lifecycle.Observer


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //val view = inflater.inflate(R.layout.fragment_first, container, false)
        //view.findViewById<RecyclerView>(R.id.listRecycler)
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        val recyclerView = binding.listRecycler


        recyclerView.layoutManager = LinearLayoutManager(activity!!)

        val citiesListAdapter = CitiesListAdapter(mutableListOf())
        recyclerView.adapter = citiesListAdapter
        var plants : MutableList<City> = mutableListOf()

        val cityObserver = Observer<List<City>> { cities ->
            citiesListAdapter.swapData(cities)
        }

        val plantsViewModel : PlantsDBViewModel by viewModels(){FlowerViewModelFactory(activity!!.application)}
        plantsViewModel.fillPlantsPublic()
        plantsViewModel.fetch().observe(this, cityObserver)

        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}