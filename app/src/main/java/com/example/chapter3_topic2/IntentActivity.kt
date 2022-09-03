package com.example.chapter3.topicDua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter3_topic2.*
import kotlinx.android.synthetic.main.activity_intent.*

class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        intentData()
        intentBundle()
        passinDataSerializeAble()
        passinDataParcelAble()

    }
//  intent ke Explicitintent.kt bawa dua data
    fun intentData(){
        btnHtung.setOnClickListener{
            var dataSatu = input1.text.toString()
            var dataDua = input2.text.toString()

//            key value
            var inten = Intent(this,ExplicitIntent::class.java)
            inten.putExtra("input1",dataSatu)
            inten.putExtra("input2",dataDua)
            startActivity(inten)
        }
    }
//  mengirim data akai bundle
    fun intentBundle(){
        btnBundleIntent.setOnClickListener {
            var dataSatu = input1.text.toString()
            var dataDua = input2.text.toString()

            var bundle = Bundle()
            var inten = Intent(this, IntentBundle::class.java)

            bundle.putString("satu", dataSatu)
            bundle.putString("dua", dataDua)

            inten.putExtras(bundle)
            startActivity(inten)
        }
    }
    fun passinDataSerializeAble(){
        btnSerializeAble.setOnClickListener{
            val inten = Intent(this,SerializeAbleActivity::class.java)
            var data = MahasiswaSer("Raynaldi","20104042","Banyumas")
            inten.putExtra("datamahasiswa",data)
            startActivity(inten)
        }
    }

    fun passinDataParcelAble(){
        btnParcelAble.setOnClickListener{
            val inten = Intent(this, PacelAbleActivity::class.java)
            var data = PersonParcelAble("Raynaldi",20,"Banyumas")
            inten.putExtra("dataperson",data)
            startActivity(inten)
        }
    }
}