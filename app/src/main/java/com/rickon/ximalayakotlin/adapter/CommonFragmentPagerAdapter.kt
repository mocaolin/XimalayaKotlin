package com.rickon.ximalayakotlin.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter

/**
 * @Description:
 * @Author:      高烁
 * @CreateDate:  2019-07-23 15:57
 * @Email:       gaoshuo521@foxmail.com
 */
class CommonFragmentPagerAdapter : FragmentPagerAdapter {
    private var titles: MutableList<String>
    private var fragments: MutableList<Fragment>

    constructor(fm: androidx.fragment.app.FragmentManager, titleList: MutableList<String>, fragmentList: MutableList<Fragment>) : super(fm) {
        titles = titleList
        fragments = fragmentList
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getCount(): Int = fragments.size

    override fun getPageTitle(position: Int): CharSequence? {
        return titles[position]
    }
}