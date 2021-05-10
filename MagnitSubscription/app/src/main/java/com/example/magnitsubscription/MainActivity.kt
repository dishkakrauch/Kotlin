package com.example.magnitsubscription

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.magnitsubscription.databinding.ActivityMainBinding
import com.example.magnitsubscription.fragments.HomeFragment
import com.example.magnitsubscription.fragments.SubsFragment
import com.example.magnitsubscription.fragments.UsrFragment

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setTheme(R.style.Theme_MagnitSubscription)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val btmNv = bindingClass.btmNv
        val nvHst = findNavController(R.id.nvHst)
        btmNv.setupWithNavController(nvHst)
    }
}