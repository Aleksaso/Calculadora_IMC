package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btncalcular: Button = findViewById(R.id.btncalcular)
        val edtPeso: EditText = findViewById(R.id.edtText_Peso)
        val edtAltura: EditText = findViewById(R.id.edtText_Altura)

        btncalcular.setOnClickListener {

            val alturastr = edtAltura.text .toString()
            val pesostr = edtPeso.text .toString()

            if(alturastr.isNotEmpty() && pesostr.isNotEmpty()){
            val altura: Float = alturastr.toFloat()
            val peso: Float = pesostr.toFloat()

            val alturaFinal: Float = altura * altura
            val result: Float = peso / alturaFinal

            val intent = Intent(this, ResultActivity::class.java)
                .apply {
                    putExtra("EXTRA_RESULT", result)
                }
            startActivity(intent)
        }else{
                Toast.makeText(this, "Rellenar todos los campos", Toast.LENGTH_SHORT).show()
            }
    }
}
}