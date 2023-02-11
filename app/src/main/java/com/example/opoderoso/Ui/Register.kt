package com.example.opoderoso.Ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.opoderoso.R
import com.example.opoderoso.databinding.ActivityRegisterBinding

class Register : AppCompatActivity(), View.OnClickListener{

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        //clicks
        binding.voltar.setOnClickListener(this)
    }


    //função de clicks
    override fun onClick(v: View) {
        if (v.id == R.id.voltar){
            startActivity(Intent(this,Login::class.java))
            finish()
        }
    }
}