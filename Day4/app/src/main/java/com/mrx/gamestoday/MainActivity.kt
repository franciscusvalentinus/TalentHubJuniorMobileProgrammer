package com.mrx.gamestoday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mrx.gamestoday.adapter.ListCharAdapter
import com.mrx.gamestoday.db.CharData
import com.mrx.gamestoday.model.GenshinChar

class MainActivity : AppCompatActivity() {

    companion object {
        @androidx.annotation.StringRes
        private val TAB_TITLES = intArrayOf(
            R.string.tab_text_1,
            R.string.tab_text_2
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sectionsPagerAdapter = com.mrx.gamestoday.adapter.SectionsPagerAdapter(this)
        val viewPager: androidx.viewpager2.widget.ViewPager2 = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: com.google.android.material.tabs.TabLayout = findViewById(R.id.tabs)
        com.google.android.material.tabs.TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = resources.getString(TAB_TITLES[position])
        }.attach()
        supportActionBar?.elevation = 0f
    }
}