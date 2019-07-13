package com.tech.simpledatabinding

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val viewModel by lazy {
        ViewModelProviders.of(this).get(PersonViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding: com.tech.simpledatabinding.databinding.ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.lifecycleOwner = this  // use Fragment.viewLifecycleOwner for fragments

        binding.personViewModel = viewModel


    }
}
