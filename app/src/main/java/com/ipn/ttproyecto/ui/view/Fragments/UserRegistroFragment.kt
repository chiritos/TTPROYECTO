package com.ipn.ttproyecto.ui.view.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.ipn.ttproyecto.R


class RegistroUserFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val inflate = inflater.inflate(R.layout.fragment_usuario_registro, container, false)
        val button_camara = inflate.findViewById<TextView>(R.id.btn_iniciar_foto)
        return inflate
    }

}