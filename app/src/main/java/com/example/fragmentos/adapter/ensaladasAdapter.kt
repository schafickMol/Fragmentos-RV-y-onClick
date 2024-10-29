package com.example.fragmentos.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentos.Ensaladas
import com.example.fragmentos.R

class ensaladasAdapter(private val ensaldasLista:List<Ensaladas>):RecyclerView.Adapter<ensaladaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ensaladaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_ensalada,parent,false)
        return ensaladaViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ensaldasLista.size
    }

    override fun onBindViewHolder(holder: ensaladaViewHolder, position: Int) {
        holder.bind(ensaldasLista[position])
    }
}