package com.example.fragmentos.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentos.Peliculas
import com.example.fragmentos.R

class peliculasAdapter (private val peliculasLista: List<Peliculas>, private val onClick:(Peliculas)->Unit): RecyclerView.Adapter<peliculaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): peliculaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pelicula, parent, false)
        return peliculaViewHolder(view, onClick)
    }

    override fun getItemCount(): Int {
        return peliculasLista.size
    }

    override fun onBindViewHolder(holder: peliculaViewHolder, position: Int) {
        holder.bind(peliculasLista[position])
    }
}