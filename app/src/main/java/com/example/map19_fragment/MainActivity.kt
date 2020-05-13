package com.example.map19_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pinkFragment = PinkFragment()
        val transaktion = supportFragmentManager.beginTransaction()
        transaktion.add(R.id.container, pinkFragment, "pinkFragment")
        transaktion.commit()

    }
}
