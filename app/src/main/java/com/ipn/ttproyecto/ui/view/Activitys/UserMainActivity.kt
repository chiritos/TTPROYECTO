package com.ipn.ttproyecto.ui.view.Activitys

import android.os.Bundle
import android.provider.ContactsContract
import android.view.Menu
import com.google.android.material.navigation.NavigationView
import androidx.navigation.ui.AppBarConfiguration
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity

import com.ipn.ttproyecto.R
import com.ipn.ttproyecto.databinding.ActivityUsuarioMainBinding
import com.ouattararomuald.slider.ImageSlider
import com.ouattararomuald.slider.SliderAdapter
import com.ouattararomuald.slider.loaders.picasso.PicassoImageLoaderFactory
import java.util.ArrayList


class UserMainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityUsuarioMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUsuarioMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageSlider = binding.root.findViewById<ImageSlider>(R.id.slider_banner)

        val imagesUrls= arrayListOf(
            "https://rentadeautobusesenmonterrey.com/wp-content/uploads/2021/12/autobus-en-renta-1024x554.jpg",
            "https://www.rentadeautobusesycamionetas.com/wp-content/uploads/2021/06/razones-para-viajar-en-autobus-rentado-este-verano.jpeg",
            "https://www.hibridosyelectricos.com/media/hibridos/images/2020/11/30/2020113015363646819.jpg"
        )

        imageSlider.adapter = SliderAdapter(
            this,
            PicassoImageLoaderFactory(),
            imageUrls = imagesUrls
        )


        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        //val navController = findNavController(R.id.nav_host_fragment_content_main_user)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow
            ), drawerLayout
        )
        //setupActionBarWithNavController(navController, appBarConfiguration)
        //navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main_user, menu)
        return true
    }

/*    override fun onSupportNavigateUp(): Boolean {
        //val navController = findNavController(R.id.nav_host_fragment_content_main_user)
        //return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }*/



}