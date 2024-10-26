package com.example.fragmentos.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentos.Peliculas
import com.example.fragmentos.R

class peliculaViewHolder (view: View, private val onClick:(Peliculas)->Unit): RecyclerView.ViewHolder(view) {
    val nombreTextView:TextView = view .findViewById(R.id.tvPeliculaNombre)

    fun bind (pelicula: Peliculas){
        nombreTextView.text= pelicula.nombre

        itemView.setOnClickListener {
            onClick(pelicula)
        }

    }

}

