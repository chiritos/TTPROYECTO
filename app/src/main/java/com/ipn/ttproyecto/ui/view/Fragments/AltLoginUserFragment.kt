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
import com.ipn.ttproyecto.ui.view.Activitys.UserMainActivity


class AltLoginUserFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val inflate = inflater.inflate(R.layout.fragment_usuario_loguin2, container, false)
        val btn_sistema=inflate.findViewById<TextView>(R.id.btn_iniciar_sistema)

        btn_sistema.setOnClickListener {
            startActivity(Intent(this.context,UserMainActivity::class.java))
        }

        return inflate
    }
}