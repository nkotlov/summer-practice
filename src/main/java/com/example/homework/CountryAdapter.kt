package com.example.homework

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CountryAdapter(
    private var countries: List<Country>,
    private val onItemClick: (Country) -> Unit
) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_country, parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val country = countries[position]
        holder.bind(country)
        holder.itemView.setOnClickListener { onItemClick(country) }
    }

    override fun getItemCount() = countries.size

    fun updateData(newCountries: List<Country>) {
        countries = newCountries
        notifyDataSetChanged()
    }

    class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val flagImageView: ImageView = itemView.findViewById(R.id.countryFlagImageView)
        private val nameTextView: TextView = itemView.findViewById(R.id.countryNameTextView)
        private val shortDescriptionTextView: TextView = itemView.findViewById(R.id.countryShortDescriptionTextView)

        fun bind(country: Country) {
            nameTextView.text = country.name
            shortDescriptionTextView.text = country.shortDescription
            Glide.with(itemView.context)
                .load(country.flagUrl)
                .into(flagImageView)
        }
    }
}