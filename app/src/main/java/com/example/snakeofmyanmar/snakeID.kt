package com.example.snakeofmyanmar

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TableLayout
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class snakeID : AppCompatActivity() {

    private val viewPager = findViewById<ViewPager>(R.id.viewPager)
    private val tabs = findViewById<TabLayout>(R.id.tabs)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.snakeid)


    }
}