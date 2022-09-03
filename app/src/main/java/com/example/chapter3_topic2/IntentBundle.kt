package com.example.chapter3_topic2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent_bundle.*

class IntentBundle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_bundle)

        ambilDataBundle()
    }
    fun ambilDataBundle(){
        var bun = intent.extras
        txtInput1bun.setText(bun?.getString("satu"))
        txtInput2bun.setText(bun?.getString("dua"))
    }
}