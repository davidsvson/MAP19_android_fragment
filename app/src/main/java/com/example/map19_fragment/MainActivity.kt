package com.example.map19_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun addPinkFragment(view : View) {
        val pinkFragment = PinkFragment()
        val transaktion = supportFragmentManager.beginTransaction()
        transaktion.add(R.id.container, pinkFragment, "pinkFragment")
        transaktion.commit()
    }

    fun removePinkFragment(view : View) {
        val pinkFragment = supportFragmentManager.findFragmentByTag("pinkFragment")
        if(pinkFragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.remove(pinkFragment)
            transaction.commit()
        } else {
            Toast.makeText(this, "Pinkfragment not found", Toast.LENGTH_SHORT)
                .show()
        }

    }

    fun addYellowFragment(view: View) {
        val yellowFragment = YellowFragment.newInstance("hej", "då")
        val transaktion = supportFragmentManager.beginTransaction()
        transaktion.add(R.id.container, yellowFragment, "yellowFragment")
        transaktion.commit()
    }

    fun removeYellowFragment(view: View) {
        val yellowFragment = supportFragmentManager.findFragmentByTag("yellowFragment")
        if(yellowFragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.remove(yellowFragment)
            transaction.commit()
        } else {
            Toast.makeText(this, "Yellowfragment not found", Toast.LENGTH_SHORT)
                .show()
        }
    }

    fun replaceWithPinkFragment( view: View) {
        val fragment = PinkFragment()

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment, "pinkFragment")
        transaction.commit()

    }

    fun changeText(view : View) {
        val fragment = supportFragmentManager.findFragmentByTag("pinkFragment") as PinkFragment?

        fragment?.setText("Susan")

    }



}
