package com.example.opoderoso.Ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.opoderoso.databinding.ActivityReserveBinding

class Reserve : AppCompatActivity() {

    private lateinit var binding: ActivityReserveBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReserveBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.home.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }

        binding.cardapio.setOnClickListener {
            startActivity(Intent(this, Menu::class.java))
            finishAffinity()
        }

        binding.perfil.setOnClickListener {
            startActivity(Intent(this, Account::class.java))
        }


    }
}