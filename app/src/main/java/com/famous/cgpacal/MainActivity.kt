package com.famous.cgpacal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.famous.cgpacal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //view binding
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.click.setOnClickListener{
            startActivity(Intent(this, Calculate::class.java))
        }
        binding.contact.setOnClickListener{
            startActivity(Intent(this, Calculate::class.java))
        }

        binding.click2.setOnClickListener {
            startActivity(Intent(this, Semester::class.java))
        }

        binding.person.setOnClickListener {
            startActivity(Intent(this, Semester::class.java))
        }
    }
}