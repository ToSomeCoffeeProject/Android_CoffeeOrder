package com.ggyu.captain

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class MenuPagerAdapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> CoffeeFragment()
            1 -> TeaFragment()
            2 -> BeverageFragment()
            else -> CoffeeFragment()
        }
    }

    override fun getCount(): Int = 3
}