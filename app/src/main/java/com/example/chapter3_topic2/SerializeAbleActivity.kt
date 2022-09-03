package com.example.chapter3_topic2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_serialize_able.*

open class SerializeAbleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serialize_able)
        ambilDataSerializeAble()
    }
    fun ambilDataSerializeAble(){
        var data = intent.getSerializableExtra("datamahasiswa") as MahasiswaSer
        txtNama.text =  data.nama
        txtNim.text =  data.nim
        txtJurusan.text =  data.jurusan
    }
}