package com.ipn.ttproyecto.UI.view.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.ipn.ttproyecto.R
import com.ipn.ttproyecto.UI.view.Fragments.RegistroUserFragment
import com.ipn.ttproyecto.UI.view.Fragments.RegistroUserFragment.OnCallFragmentRegistroListener
import com.ipn.ttproyecto.UI.view.Fragments.ValidacionNumeroUserFragment
import com.ipn.ttproyecto.databinding.ActivityUsuarioInicioBinding

class InicioUserActivity : AppCompatActivity(), OnCallFragmentRegistroListener {

    private lateinit var binding: ActivityUsuarioInicioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUsuarioInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSesionUsuario.setOnClickListener {
            this.selectOptionUsuario(RegistroUserFragment())
        }

        binding.btnRegistrarUsuario.setOnClickListener {
            this.selectOptionUsuario(ValidacionNumeroUserFragment())
        }
    }

    fun selectOptionUsuario(fragment:Fragment){
        this.supportFragmentManager.beginTransaction().add(R.id.content_usuario_inicio,fragment).commit()
    }

    override fun onAttachFragment(fragment: Fragment) {
        if (fragment is RegistroUserFragment)
            fragment.setOnCallFragmentRegistroListener(this)
    }

    override fun removeFragment(fragment: Fragment) {
        this.supportFragmentManager
            .beginTransaction()
            .remove(fragment)
            .commit()
    }

}