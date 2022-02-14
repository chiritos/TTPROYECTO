package com.ipn.ttproyecto.UI.view.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ipn.ttproyecto.R
import com.ipn.ttproyecto.databinding.ActivityPersonSelectBinding
import com.ipn.ttproyecto.databinding.ActivityUsuarioMainBinding

class SelectPersonActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPersonSelectBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPersonSelectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnUser.setOnClickListener {

        }

        binding.btnUser.setOnClickListener {

        }

    }
}