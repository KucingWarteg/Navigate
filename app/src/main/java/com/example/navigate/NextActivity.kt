package com.example.navigate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val name = intent.getStringExtra("EXTRA_NAME")
        val city = intent.getStringExtra("EXTRA_CITY")
        val combined = "$name is from $city"

        val tvResult: TextView = findViewById(R.id.tvResult)
        tvResult.text = combined

        val btnBack: Button = findViewById(R.id.btnBackActivity)
        btnBack.setOnClickListener {
            finish()
        }
    }
}