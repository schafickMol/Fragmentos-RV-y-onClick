package com.example.fragmentos.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentos.R
import com.example.fragmentos.favoritos


class favoritosAdapter (private val favoritosList: List<favoritos>):RecyclerView.Adapter<favoritosViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): favoritosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_favorito,parent,false)
        return favoritosViewHolder(view)
    }

    override fun getItemCount(): Int {
        return favoritosList.size
    }

    override fun onBindViewHolder(holder: favoritosViewHolder, position: Int) {
        holder.bind(favoritosList[position])
    }

}