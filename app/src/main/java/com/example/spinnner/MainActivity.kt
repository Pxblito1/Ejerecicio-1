package com.example.spinnner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.spinnner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var mapa = mutableMapOf<String, String>()
        val adaptador: ArrayAdapter<*> = ArrayAdapter.createFromResource(
            this, R.array.Datos, android.R.layout.simple_spinner_item
        )
        binding.spinner.adapter = adaptador
        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(
                    this@MainActivity, "selección: ".plus(position.toString()),
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@MainActivity, "sin selección", Toast.LENGTH_SHORT).show()

            }
        }
        binding.btnaAdir.setOnClickListener {
            mapa
        }
        binding.btnenviar.setOnClickListener {
            val   myintent=Intent(this,ResultActivity ::class.java )
            myintent.putExtra("Nombre", binding.etinformacion.text)
            myintent.putExtra("Sexo", binding.etinformacion.text)
            myintent.putExtra("Email", binding.etinformacion.text)
            myintent.putExtra("Ciudad", binding.etinformacion.text)
            myintent.putExtra("Teléfono", binding.etinformacion.text)
            myintent.putExtra("Edad", binding.etinformacion.text)
            startActivity(myintent)

        }
    }
}