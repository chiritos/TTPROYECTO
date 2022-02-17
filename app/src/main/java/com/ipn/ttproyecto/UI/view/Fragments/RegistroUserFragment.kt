package com.ipn.ttproyecto.UI.view.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ipn.ttproyecto.R


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class RegistroUserFragment : Fragment() {


    private var param1: String? = null
    private var param2: String? = null
    internal lateinit var callback :OnCallFragmentRegistroListener


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        activity?.onBackPressed().let {
            callback.removeFragment(this)
        }

        return inflater.inflate(R.layout.fragment_usuario_registro, container, false)
    }

    fun setOnCallFragmentRegistroListener(callback: OnCallFragmentRegistroListener){
        this.callback=callback
    }

    companion object {

        fun newInstance(param1: String, param2: String) =
            RegistroUserFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
        }
    }

    interface OnCallFragmentRegistroListener{
        fun removeFragment(fragment:Fragment)
    }



}