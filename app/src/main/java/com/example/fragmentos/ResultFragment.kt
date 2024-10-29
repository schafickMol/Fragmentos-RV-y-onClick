package com.example.fragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class ResultFragment : Fragment() {
    private lateinit var namePelicula:TextView
    private lateinit var imagePizza: ImageView
    private lateinit var precioPizza: TextView
    private lateinit var descripcionPizza: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_result, container, false)
        namePelicula= view.findViewById(R.id.tvnamePelicula)
        imagePizza = view.findViewById(R.id.ivPizzaImage)
        precioPizza = view.findViewById(R.id.tvPrecio)
        descripcionPizza = view.findViewById(R.id.tvDescripcion)


        val nombrePelicula = arguments?.getString("nombre_pelicula")
        val image = arguments?.getInt("image")
        val precio = arguments?.getDouble("precio")
        val descripcion = arguments?.getString("descripcion")
        namePelicula.text = nombrePelicula
        image?.let { imagePizza.setImageResource(it) } // Configura la imagen
        precioPizza.text = "Precio: $${precio.toString()}"
        descripcionPizza.text = descripcion


        return view

    }
    companion object {
        fun newInstance(nombre: String, image: Int, precio: Double, descripcion: String): ResultFragment{
            val fragment = ResultFragment()
            val args= Bundle()
            args.putString("nombre", nombre)
            args.putInt("image", image)
            args.putDouble("precio", precio)
            args.putString("descripcion", descripcion)
            fragment.arguments = args
            return fragment
        }
    }

}