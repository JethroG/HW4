package com.yourcompany.bro.hi.tablayout.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.yourcompany.bro.hi.tablayout.fragm.FragmentDay
import com.yourcompany.bro.hi.tablayout.fragm.FragmentMonth
import com.yourcompany.bro.hi.tablayout.fragm.FragmentZodiak

class Adapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                FragmentDay()

            }
            1 -> FragmentMonth()
            else -> {
                return FragmentZodiak()
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Day of week"
            1 -> "Month of Year"
            else -> {
                return "Zodiac Magic"
            }
        }
    }


}