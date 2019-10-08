package com.originalstocks.jetpacknaviagtiondemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

    lateinit var drawer: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        // setting up the default my fragment as an host
        val host =
            supportFragmentManager.findFragmentById(R.id.my_fragment) as NavHostFragment? ?: return
        val navController = host.navController
        drawer =
            findViewById(R.id.container) // parent view over which diff. fragments will be inflated.

        // Setting up NavigationUI

        NavigationUI.setupActionBarWithNavController(
            this,
            navController,
            drawer
        ) // context, controller, parentView


    }

    override fun onSupportNavigateUp(): Boolean {
        try {
            return NavigationUI.navigateUp(Navigation.findNavController(this, R.id.my_fragment), drawer)
        }catch (e : Exception){
            e.printStackTrace()
        }
        return onNavigateUp()
    }

}
