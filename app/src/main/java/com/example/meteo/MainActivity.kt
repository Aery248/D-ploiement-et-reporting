package com.example.testapp3almoc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var mainActivityCentralTextView: TextView
    private lateinit var topLeftTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//FIND VIEW BY ID INTERDIT ICI
        // INITIALISATION OF THE VIEW
        setContentView(R.layout.activity_main)
        this.mainActivityCentralTextView = findViewById(R.id.main_activity_central_text_tv) // crash
        this.mainActivityCentralTextView.text = "New Text!"
        this.topLeftTextView = findViewById(R.id.main_activity_second_text)
        this.topLeftTextView.text = "Android c'est cool!"
    }
}