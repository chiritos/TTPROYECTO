package com.ipn.ttproyecto.ui.view.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.ipn.ttproyecto.R
import com.ipn.ttproyecto.ui.view.Activitys.UserLoginActivity

class ValidacionNumeroUserFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val inflate = inflater.inflate(R.layout.fragment_usuario_validacionnumero, container, false)
        val button_login=inflate.findViewById<TextView>(R.id.btn_continue_loguin)

        button_login.setOnClickListener {
            startActivity(Intent(context,UserLoginActivity::class.java))
        }

        return inflate
    }

}