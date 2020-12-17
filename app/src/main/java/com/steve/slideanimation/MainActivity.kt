package com.steve.slideanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.inflate
import android.widget.TextView
import androidx.core.graphics.drawable.DrawableCompat.inflate
import androidx.databinding.DataBindingUtil
import com.steve.slideanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding= ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        binding.root.setOnClickListener {
//            binding.tvHello.slideUp(1000L,0L)
//        }

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.tvHello.setOnClickListener {
            binding.tvHello.slideUp(1000L,0)

        }

    }
}