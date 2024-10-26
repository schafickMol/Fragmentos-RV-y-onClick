package com.example.fragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class ResultFragment : Fragment() {
    private lateinit var namePelicula:TextView

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


        val nombrePelicula = arguments?.getString("nombre_pelicula")
        namePelicula.text = nombrePelicula


        return view

    }
    companion object {
        fun newInstance(nombrePelicula: String): ResultFragment{
            val fragment = ResultFragment()
            val args= Bundle()
            args.putString("nombre_pelicula", nombrePelicula)
            fragment.arguments = args
            return fragment
        }
    }

}