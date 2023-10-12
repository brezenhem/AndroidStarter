package de.vtm_fair.app.ui.main

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import de.vtm_fair.app.R
import de.vtm_fair.app.ui.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity(), MainContract.View {
    private lateinit var navController: NavController

    @Inject
    lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_main)
        initToolbar()
        navController = findNavController(R.id.nav_host_fragment)
    }

    private fun initToolbar() {
        setSupportActionBar(findViewById(R.id.toolbar))
    }

}