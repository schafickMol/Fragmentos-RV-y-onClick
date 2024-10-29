package com.example.fragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentos.adapter.ensaladasAdapter


class segundoFragmento : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_segundo_fragmento, container, false)

        recyclerView=view.findViewById(R.id.rvLista2)
        recyclerView.layoutManager= GridLayoutManager(context, 2)
        recyclerView.adapter= ensaladasAdapter(ensaladasProvider.ensaladasList)

        return view
    }


}