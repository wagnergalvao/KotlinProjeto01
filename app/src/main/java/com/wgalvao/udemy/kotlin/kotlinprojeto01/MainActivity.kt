package com.wgalvao.udemy.kotlin.kotlinprojeto01

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clique(view: View) {
        println("Ok, você clicou!")
    }
}