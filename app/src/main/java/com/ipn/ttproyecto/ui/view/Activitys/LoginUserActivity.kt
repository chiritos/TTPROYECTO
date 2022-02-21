package com.ipn.ttproyecto.ui.view.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.ipn.ttproyecto.R
import com.ipn.ttproyecto.databinding.ActivityUsuarioLoginBinding
import com.ipn.ttproyecto.ui.view.Fragments.CodeSmsUserFragment
import com.ipn.ttproyecto.ui.view.Interface.IManagerFragments

class LoginUserActivity : AppCompatActivity(),IManagerFragments {

    private lateinit var binding:ActivityUsuarioLoginBinding
    private lateinit var currentFragment:Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityUsuarioLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLoginBiometrico.setOnClickListener {

        }

        binding.btnInitloginCode.setOnClickListener {
            this.selectFragmentUser(CodeSmsUserFragment())
        }
    }

    override fun selectFragmentUser(fragment: Fragment) {
        this.supportFragmentManager
            .beginTransaction()
            .add(R.id.content_usuario_login, fragment)
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