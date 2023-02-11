package com.example.opoderoso.Ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.opoderoso.databinding.ActivityMenuBinding


class Menu : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.home.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }

        binding.reservas.setOnClickListener {
            startActivity(Intent(this, Reserve::class.java))
            finishAffinity()
        }

        binding.perfil.setOnClickListener {
            startActivity(Intent(this, Account::class.java))
        }
    }
}