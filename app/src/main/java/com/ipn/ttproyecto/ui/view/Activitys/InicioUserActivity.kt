package com.ipn.ttproyecto.ui.view.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.ipn.ttproyecto.R
import com.ipn.ttproyecto.ui.view.Fragments.RegistroUserFragment
import com.ipn.ttproyecto.ui.view.Fragments.ValidacionNumeroUserFragment
import com.ipn.ttproyecto.databinding.ActivityUsuarioInicioBinding
import com.ipn.ttproyecto.ui.view.Interface.IManagerFragments

class InicioUserActivity : AppCompatActivity(),IManagerFragments {

    private lateinit var binding: ActivityUsuarioInicioBinding
    private lateinit var currentFragment: Fragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUsuarioInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSesionUsuario.setOnClickListener {
            this.selectFragmentUser(ValidacionNumeroUserFragment())
        }

        binding.btnRegistrarUsuario.setOnClickListener {
            this.selectFragmentUser(RegistroUserFragment())
        }
    }

    override fun onAttachFragment(fragment: Fragment) {
        currentFragment = fragment;
    }

    override fun onBackPressed(){
        val countFragment = supportFragmentManager.backStackEntryCount
        if ( countFragment >= 1)
            this.removeFragment(currentFragment)
        else
            super.onBackPressed()
    }

    override fun selectFragmentUser(fragment: Fragment) {
        this.supportFragmentManager
            .beginTransaction()
            .add(R.id.content_usuario_inicio, fragment)
            .addToBackStack(null)
            .commit()
    }

    override fun removeFragment(fragment: Fragment) {

        val manager = this.supportFragmentManager
        val transaction = manager.beginTransaction()

        transaction
            .remove(fragment)
            .commit()
        manager
            .popBackStack()
    }

}