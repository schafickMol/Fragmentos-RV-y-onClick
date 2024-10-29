package com.example.fragmentos.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentos.Ensaladas
import com.example.fragmentos.R
import com.example.fragmentos.favoritos

class favoritosViewHolder (view: View): RecyclerView.ViewHolder(view) {
    val nombreTextView: TextView = view .findViewById(R.id.tvfavoritoNombre)
    val precioTextView: TextView = view .findViewById(R.id.tvfavoritoPrecio)
    val imagenImageView: ImageView = view .findViewById(R.id.ivfavoritoImage)

    fun bind(favoritos: favoritos){
        nombreTextView.text=favoritos.nombre
        precioTextView.text="Precio: $$favoritos.precio}"
        imagenImageView.setImageResource(favoritos.image)
    }
}