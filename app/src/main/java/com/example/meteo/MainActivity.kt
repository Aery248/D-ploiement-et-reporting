package com.example.meteo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.meteo.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Lie le layout à l'activité
        setContentView(R.layout.activity_main)
    }
}
