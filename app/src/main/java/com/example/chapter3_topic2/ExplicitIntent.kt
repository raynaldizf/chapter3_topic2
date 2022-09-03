package com.example.chapter3.topicDua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter3_topic2.R
import kotlinx.android.synthetic.main.activity_explicit_intent.*

class ExplicitIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent)

        ambilData()
    }

    fun ambilData(){
        var dataSatu = intent.getStringExtra("input1")
        var dataDua = intent.getStringExtra("input2")
        txtInput1.text = dataSatu
        txtInput2.text = dataDua
    }
}