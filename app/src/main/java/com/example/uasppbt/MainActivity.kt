package com.example.uasppbt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.uasppbt.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        cardMakanan.setOnClickListener {
            val intent = Intent(this, ActivityMakanMinum::class.java)
            startActivity(intent)
        }
        cardRumah.setOnClickListener {
            val intent = Intent(this, ActivityRumahDapur::class.java)
            startActivity(intent)
        }
        cardIbu.setOnClickListener {
            val intent = Intent(this, ActivityIbuAnak::class.java)
            startActivity(intent)
        }
        cardKesehatan.setOnClickListener {
            val intent = Intent(this, ActivityKesehatanKecantikan::class.java)
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_option, menu)
        return true
    }
}