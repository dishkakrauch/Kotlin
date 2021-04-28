package com.example.magnitsubscription

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import com.example.magnitsubscription.databinding.ActivityMainBinding
import com.example.magnitsubscription.fragments.HomeFragment
import com.example.magnitsubscription.fragments.SubsFragment
import com.example.magnitsubscription.fragments.UsrFragment

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        val homeFragment: Fragment = HomeFragment()
        val subsFragment: Fragment = SubsFragment()
        val usrFragment: Fragment = UsrFragment()

        makeCurrentFragment(homeFragment)
        bindingClass.btmNv.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.menItHome -> makeCurrentFragment(homeFragment)
                R.id.menItSubs -> makeCurrentFragment(subsFragment)
                R.id.menItUsr -> makeCurrentFragment(usrFragment)
            }
            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) = supportFragmentManager.beginTransaction().apply {
        replace(R.id.frmLyt, fragment)
        commit()
    }
}