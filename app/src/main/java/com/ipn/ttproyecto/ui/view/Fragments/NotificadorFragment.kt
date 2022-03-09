package com.ipn.ttproyecto.ui.view.Fragments

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import java.lang.IllegalStateException

class NotificadorFragment : DialogFragment() {

    private var isTwoOption:Boolean = false
    private lateinit var mensaje:String

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return (activity?.let {

            val builder = AlertDialog.Builder(it)

            if(isTwoOption){
                builder.setMessage(this.mensaje)
                    .setPositiveButton("SI",DialogInterface.OnClickListener { dialog, id ->

                    })
                    .setNegativeButton("Salir de la app",DialogInterface.OnClickListener { dialog, id ->

                    })
            }else{
                builder.setMessage(this.mensaje)
                    .setPositiveButton("SI",DialogInterface.OnClickListener { dialog, id ->

                    })
            }

            builder.create()
        } ?: throw IllegalStateException("El dialogo no puede ser abierto")) as Dialog
    }


    fun setMensaje(mensaje:String){
       this.mensaje=mensaje
    }

    fun setTwoOptions(choice:Boolean){
        this.isTwoOption=choice
    }

}