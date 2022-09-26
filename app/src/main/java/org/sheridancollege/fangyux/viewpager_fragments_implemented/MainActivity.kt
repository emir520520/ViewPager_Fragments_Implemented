package org.sheridancollege.fangyux.viewpager_fragments_implemented

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize a list of fragments
        val fragmentList=ArrayList<Fragment>()

        //Add 4 fragments to the list
        fragmentList.add(ViewPagerFragment.newInstance("Janeway"))
        fragmentList.add(ViewPagerFragment.newInstance("Kirk"))
        fragmentList.add(ViewPagerFragment.newInstance("McCoy"))
        fragmentList.add(ViewPagerFragment.newInstance("Sisko"))

        val pageAdapter=FragmentViewPagerAdapter(supportFragmentManager, fragmentList)

        val viewPager=findViewById<ViewPager>(R.id.viewPager)

        viewPager.adapter=pageAdapter
    }

    private inner class FragmentViewPagerAdapter(fm: FragmentManager, private val fragments: ArrayList<Fragment>):
        FragmentPagerAdapter(fm){

        override fun getCount(): Int {
            return this.fragments.size
        }

        override fun getItem(position: Int): Fragment {
            return this.fragments[position]
        }
    }
}