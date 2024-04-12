package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btniniciar: Button = findViewById(R.id.btniniciar)

        btniniciar.setOnClickListener {

            val intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
        }
    }