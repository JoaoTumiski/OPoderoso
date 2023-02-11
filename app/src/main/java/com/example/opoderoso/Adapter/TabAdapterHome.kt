package com.example.opoderoso.Adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.opoderoso.Fragments.Events
import com.example.opoderoso.Fragments.Hooka
import com.example.opoderoso.Fragments.Vapes

internal class TabAdapterHome(var context: Context, fm: FragmentManager, var TotalTabs: Int) :
    FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return TotalTabs
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                Events()
            }

            1 -> {
                Hooka()
            }

            2 -> {
                Vapes()
            }else -> getItem(position)
        }
    }

}