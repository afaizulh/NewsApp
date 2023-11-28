package com.faizul.newsapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.faizul.newsapp.ui.home.EducationFragment
import com.faizul.newsapp.ui.home.MusicFragment
import com.faizul.newsapp.ui.home.TechnologyFragment
import com.faizul.newsapp.ui.home.TopFragment

class SectionPagerAdapter(fa: FragmentActivity): FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> TopFragment()
            1 -> MusicFragment()
            2 -> TechnologyFragment()
            3 -> EducationFragment()
            else -> TopFragment()
        }
    }
}