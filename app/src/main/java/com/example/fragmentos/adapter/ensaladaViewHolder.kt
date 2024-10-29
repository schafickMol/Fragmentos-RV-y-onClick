package com.example.fragmentos.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentos.Ensaladas
import com.example.fragmentos.R

class ensaladaViewHolder (view:View): RecyclerView.ViewHolder(view) {
    val nombreTextView2: TextView = view .findViewById(R.id.tvEnsaladaNombre)
    val precioTextView2: TextView = view .findViewById(R.id.tvEnsaladaPrecio)
    val imagenImageView2: ImageView = view .findViewById(R.id.ivEnsaldaImage)

    fun bind(ensaladas: Ensaladas){
        nombreTextView2.text=ensaladas.nombre
        precioTextView2.text="Precio: $${ensaladas.precio}"
        imagenImageView2.setImageResource(ensaladas.image)
    }

}