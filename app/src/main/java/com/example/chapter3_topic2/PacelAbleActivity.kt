package com.example.chapter3_topic2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pacel_able.*

class PacelAbleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pacel_able)

        var dataperson = intent.getParcelableExtra("dataperson") as PersonParcelAble?

        txtnama.text = dataperson?.nama.toString()
        txtumur.text = dataperson?.umur.toString()
        txtkota.text = dataperson?.kota.toString()
    }
}