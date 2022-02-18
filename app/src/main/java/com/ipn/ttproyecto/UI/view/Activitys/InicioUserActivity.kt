package com.ipn.ttproyecto.UI.view.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.ipn.ttproyecto.R
import com.ipn.ttproyecto.UI.view.Fragments.RegistroUserFragment
import com.ipn.ttproyecto.UI.view.Fragments.ValidacionNumeroUserFragment
import com.ipn.ttproyecto.databinding.ActivityUsuarioInicioBinding

class InicioUserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUsuarioInicioBinding
    private lateinit var currentFragment: Fragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUsuarioInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSesionUsuario.setOnClickListener {
            this.selectOptionUsuario(ValidacionNumeroUserFragment())
        }

        binding.btnRegistrarUsuario.setOnClickListener {
            this.selectOptionUsuario(RegistroUserFragment())
        }
    }

    fun selectOptionUsuario(fragment: Fragment) {
        this.supportFragmentManager
            .beginTransaction()
            .add(R.id.content_usuario_inicio, fragment)
            .addToBackStack(null)
            .commit()
    }

    override fun onAttachFragment(fragment: Fragment) {
        currentFragment = fragment;
    }

    private fun removeFragment(fragment: Fragment) {

        val manager = this.supportFragmentManager
        val transaction = manager.beginTransaction()

        transaction
            .remove(fragment)
            .commit()
        manager
            .popBackStack()
    }

    override fun onBackPressed(){
        val countFragment = supportFragmentManager.backStackEntryCount
        if ( countFragment >= 1)
            this.removeFragment(currentFragment)
        else
            super.onBackPressed()
    }
}