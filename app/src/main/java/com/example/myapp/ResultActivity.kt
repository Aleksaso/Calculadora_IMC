package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val txvResult = findViewById<TextView>(R.id.textView_result)
        val tvClasificacion = findViewById<TextView>(R.id.textView_clasificacion)
        val result = intent.getFloatExtra("EXTRA_RESULT", 0.1f)

        txvResult.text = result.toString()

        var clasificacion = ""
        if (result < 18.5f) {
            clasificacion = "Bajo Peso"
        } else if (result >= 18.5f && result <= 24.9f) {
            clasificacion = "normal"
        } else if (result >= 25f && result <= 29.9f) {
            clasificacion = "Soprepeso"
        } else if (result >= 30f && result <= 39.9f) {
            clasificacion = "Obesidad"
        } else {
            clasificacion = "Obesidad Grave"
        }
        tvClasificacion.text = getString(R.string.message_clasificacion, clasificacion)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}
