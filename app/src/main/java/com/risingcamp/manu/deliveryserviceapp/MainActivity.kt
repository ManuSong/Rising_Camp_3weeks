package com.risingcamp.manu.deliveryserviceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.risingcamp.manu.deliveryserviceapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Glide.with(this).load(R.raw.main_delivery_move).override(180,180).into(binding.bm1GifImg)
    }
}