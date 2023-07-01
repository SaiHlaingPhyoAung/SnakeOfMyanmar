package com.example.snakeofmyanmar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class snakeID : AppCompatActivity() {

    private lateinit var recyclewView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snakeid)

        var ivBack = findViewById<ImageView>(R.id.ivBack)
        var viewPager = findViewById<ViewPager>(R.id.viewPager)
        var tabs = findViewById<TabLayout>(R.id.tabs)

        val fragmentAdapter = snakeID_ViewPagerAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(normalSnake() , "အဆိပ်မရှိ")
        fragmentAdapter.addFragment(venomousSnake() , "အဆိပ်ပျော့")
        fragmentAdapter.addFragment(poisonousSnake() , "အဆိပ်ပြင်း")

        viewPager.adapter = fragmentAdapter
        tabs.setupWithViewPager(viewPager)

        ivBack.setOnClickListener {
            finish()
        }

    }


}