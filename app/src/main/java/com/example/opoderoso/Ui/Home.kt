package com.example.opoderoso.Ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.example.opoderoso.Adapter.TabAdapterHome
import com.example.opoderoso.R
import com.example.opoderoso.databinding.ActivityHomeBinding
import com.google.android.material.tabs.TabLayout

class Home : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityHomeBinding

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        //clicks
        binding.cardapio.setOnClickListener(this)
        binding.reservas.setOnClickListener(this)
        binding.perfil.setOnClickListener(this)

        //tab layout

        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.ViewPager)

        tabLayout.addTab(tabLayout.newTab().setText("Eventos"))
        tabLayout.addTab(tabLayout.newTab().setText("Hooka"))
        tabLayout.addTab(tabLayout.newTab().setText("Vapes"))
        tabLayout.tabGravity = TabLayout.GRAVITY_CENTER


        val adapter = TabAdapterHome(
            this, supportFragmentManager,
            tabLayout.tabCount
        )
        viewPager.adapter = adapter

        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

        })
    }


    override fun onClick(v: View) {
        if (v.id == R.id.cardapio) {
            startActivity(Intent(this, Menu::class.java))
        } else if (v.id == R.id.reservas) {
            startActivity(Intent(this, Reserve::class.java))
        } else if (v.id == R.id.perfil) {
            startActivity(Intent(this, Account::class.java))
        }
    }


}