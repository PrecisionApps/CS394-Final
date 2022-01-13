package com.example.ozgeyildizplantsapp;

import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.widget.ImageView
import androidx.navigation.Navigation
import com.bumptech.glide.Glide

class CitiesListAdapter(val data: MutableList<City>) : RecyclerView.Adapter<CitiesListAdapter.ItemViewHolder>() {
    class ItemViewHolder(val item: View) : RecyclerView.ViewHolder(item) {


        private val plantKey = "Plants"
        lateinit var plant: City


        fun bind(plant: City) {
            this.plant = plant

            val textView = itemView.findViewById<TextView>(R.id.textView)
            val desc = itemView.findViewById<TextView>(R.id.dateTextView)
            val image = itemView.findViewById<ImageView>(R.id.plant_item_image)

            textView.text = plant.cityName
            desc.text = plant.zipCode
            Glide.with(image.context).load(plant.imageURL).into(image);


            item.setOnClickListener {
                //click handling

                val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment()

                //Navigation.findNavController(item.rootView.findViewById(R.id.fragmentContainerView)).navigate(action)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layout =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_plant, parent, false)
        return ItemViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val todo = data[position]
        holder.bind(todo)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun swapData(plant: List<City>) {
        data.clear()
        data.addAll(plant)
        notifyDataSetChanged()
    }
}