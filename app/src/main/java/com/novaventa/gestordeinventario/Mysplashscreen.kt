package com.novaventa.gestordeinventario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Mysplashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        setTheme(R.style.SplashTheme)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mysplashscreen)
    }
}