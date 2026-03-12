package com.example.projekutsgeneratornilai

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etNama = findViewById<EditText>(R.id.etNamaDosen)
        val btnMasuk = findViewById<Button>(R.id.btnMasuk)

        btnMasuk.setOnClickListener {

            val namaDosen = etNama.text.toString()

            val intent = Intent(this, GeneratorActivity::class.java)
            intent.putExtra("NAMA_DOSEN", namaDosen)

            startActivity(intent)
        }
    }
}