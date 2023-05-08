package com.application.circularmotionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class CarouselActivity : AppCompatActivity() {
    lateinit var bundle: Bundle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carousel)

           replaceFragment(CarouselFragment())

    }

    fun replaceFragment(fragment: Fragment){
        val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.replace(R.id.framelayout, fragment, "CarouselFragment")
        ft.commit()
    }
}