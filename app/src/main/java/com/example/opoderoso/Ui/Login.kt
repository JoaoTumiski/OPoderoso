package com.example.opoderoso.Ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.opoderoso.R
import com.example.opoderoso.databinding.ActivityLoginBinding

class Login : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        //clicks
        binding.Acessar.setOnClickListener(this)
        binding.textCriarconta.setOnClickListener{
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }


    //função de clicks
    override fun onClick(v: View) {
        if (v.id == R.id.Acessar){
            startActivity(Intent(this, Home::class.java))
            finish()
        }
    }
}