package com.example.snakeofmyanmar

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter (fm : FragmentManager): FragmentPagerAdapter(fm){
    /**
     * Return the number of views available.
     */
    override fun getCount(): Int {
        TODO("Not yet implemented")
    }


    /**
     * Return the Fragment associated with a specified position.
     */
    override fun getItem(position: Int): Fragment {
        TODO("Not yet implemented")
    }

}