package com.example.spinnner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spinnner.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val datos = intent.extras
        binding.tvsol.text = datos?.get("Nombre").toString()
        binding.tvsol.text = datos?.get("Sexo").toString()
        binding.tvsol.text = datos?.get("Email").toString()
        binding.tvsol.text = datos?.get("Ciudad").toString()
        binding.tvsol.text = datos?.get("Teléfono").toString()
        binding.tvsol.text = datos?.get("Edad").toString()

        binding.btnvolver.setOnClickListener {
            onBackPressed()
        }

    }
}