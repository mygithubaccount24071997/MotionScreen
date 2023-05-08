package com.application.circularmotionlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        tvfav.setOnClickListener {
            startActivity(Intent(this,CarouselActivity::class.java))
        }
        tvtxt2.setOnClickListener {
            startActivity(Intent(this,CarouselActivity::class.java))
        }
        tvName.setOnClickListener {
            startActivity(Intent(this,CarouselActivity::class.java))
        }
    }
}