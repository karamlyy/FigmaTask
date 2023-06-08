package com.emilabdurahmanli.zireddinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.emilabdurahmanli.zireddinapplication.core.bottom_navigation_fragments.HomeFragment
import com.emilabdurahmanli.zireddinapplication.core.bottom_navigation_fragments.HoroscopeFragment
import com.emilabdurahmanli.zireddinapplication.core.bottom_navigation_fragments.MailFragment
import com.emilabdurahmanli.zireddinapplication.core.bottom_navigation_fragments.PalmistryFragment
import com.emilabdurahmanli.zireddinapplication.databinding.ActivityHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class HomeActivity : AppCompatActivity() {

    lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        loadFragment(HomeFragment())
        bottomNav = findViewById(R.id.bottomNav) as BottomNavigationView
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    loadFragment(HomeFragment())
                    true
                }
                R.id.palmistry -> {
                    loadFragment(PalmistryFragment())
                    true
                }
                R.id.horoscope -> {
                    loadFragment(HoroscopeFragment())
                    true
                }
                R.id.mail -> {
                    loadFragment(MailFragment())
                    true
                }

                else -> {true}
            }
        }
    }
    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }
}