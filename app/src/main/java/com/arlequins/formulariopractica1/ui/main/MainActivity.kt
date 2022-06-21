package com.arlequins.formulariopractica1.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arlequins.formulariopractica1.R
import com.arlequins.formulariopractica1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)
//main
        //mundo
    }
}