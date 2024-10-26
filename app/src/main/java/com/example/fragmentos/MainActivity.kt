package com.example.fragmentos

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var navegacion: BottomNavigationView

    private fun loadFragment(fragment: androidx.fragment.app.Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameContainer,fragment)
            addToBackStack("Replacement")
            commit()
        }
    }

    private val mOnNavMenu = BottomNavigationView.OnNavigationItemSelectedListener {item ->
        when(item.itemId){
            R.id.fragmento1->{
                loadFragment(Fragment_Uno())
                true
            }
            R.id.fragmento2->{
                loadFragment(segundoFragmento())
                true
            }
            R.id.fragmento3->{
                loadFragment(tercerFragment())
                true
            }else -> false
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        navegacion = findViewById(R.id.nav_Menu)
        navegacion.setOnNavigationItemSelectedListener(mOnNavMenu)

        if(savedInstanceState == null){
            loadFragment(Fragment_Uno())
        }
    }
}