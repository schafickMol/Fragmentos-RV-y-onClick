package com.example.fragmentos

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class  MainActivity : AppCompatActivity() {
    lateinit var navegacion: BottomNavigationView

    lateinit var toolbar: Toolbar

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
        toolbar = findViewById(R.id.toolbar)

        if(savedInstanceState == null){
            loadFragment(Fragment_Uno())
        }
        toolbar=findViewById(R.id.toolbar)
        toolbar.title=""
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar,menu)
        return true
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.nav_buscar->{
                Toast.makeText(this, "Opcion en desarrollo dx", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.nav_regalo-> {
                Toast.makeText(this, "Opcion en desarrollo dx", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.nav_salir-> {
                Toast.makeText(this, "Opcion en desarrollo dx", Toast.LENGTH_SHORT).show()
                true
            }else->false
        }
    }
}