package com.example.fragments

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragment1 = ExampleFirstFragment()
        binding.butShowFirstFragment.setOnClickListener {
        supportFragmentManager.beginTransaction().add(binding.tvPlaceForFragment.id, fragment1).commit()
        }

        val fragment2 = ExampleSecondFragment()
        binding.button5.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(binding.tvPlaceForFragment.id, fragment2).commit()
        }

        binding.butRemoveFragment.setOnClickListener {
            supportFragmentManager.beginTransaction().remove(fragment1).commit()
            supportFragmentManager.beginTransaction().remove(fragment2).commit()
        }





    }
}