package com.ipn.ttproyecto.ui.view.Activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.ipn.ttproyecto.R
import com.ipn.ttproyecto.databinding.ActivityUsuarioLoginBinding
import com.ipn.ttproyecto.ui.view.Fragments.CodeSmsUserFragment
import com.ipn.ttproyecto.ui.view.Interface.IManagerFragments

class UserLoginActivity : AppCompatActivity(),IManagerFragments {

    private lateinit var binding:ActivityUsuarioLoginBinding
    private lateinit var currentFragment:Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityUsuarioLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLoginBiometrico.setOnClickListener {
            startActivity(Intent(this,UserMainActivity::class.java))
        }

        binding.btnInitloginCode.setOnClickListener {
            this.selectFragmentUser(CodeSmsUserFragment())
        }
    }

    override fun onAttachFragment(fragment: Fragment) {
        this.currentFragment=fragment
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

    override fun onBackPressed(){
        val countFragment = supportFragmentManager.backStackEntryCount
        if ( countFragment >= 1)
            this.removeFragment(currentFragment)
        else
            super.onBackPressed()
    }
}