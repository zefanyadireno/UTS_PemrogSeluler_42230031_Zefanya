package com.example.projekutsgeneratornilai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class GeneratorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generator)

        val tvSapaan = findViewById<TextView>(R.id.tvSapaan)
        val etJumlah = findViewById<EditText>(R.id.etJumlahMahasiswa)
        val etNilai = findViewById<EditText>(R.id.etRataNilai)
        val btnProses = findViewById<Button>(R.id.btnProses)
        val tvHasil = findViewById<TextView>(R.id.tvHasil)

        val namaDosen = intent.getStringExtra("NAMA_DOSEN")

        tvSapaan.text = "Selamat bertugas, Dosen $namaDosen"

        btnProses.setOnClickListener {

            val jumlah = etJumlah.text.toString().toInt()
            val nilai = etNilai.text.toString().toDouble()

            val status = when {
                nilai >= 80 -> "Sangat Baik"
                nilai >= 60 -> "Cukup"
                else -> "Kurang"
            }

            var daftarAbsen = ""

            for (i in 1..jumlah) {
                daftarAbsen += "Mahasiswa $i : ______ \n"
            }

            tvHasil.text = "Status Kelas: $status\n\n$daftarAbsen"
        }
    }
}