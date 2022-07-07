package com.example.englanguage.offlinemode.fragmentflipcardoff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.englanguage.R

class ViewPagerFragmentOff : Fragment() {
    private lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager_off, container, false)
        viewPager = view.findViewById(R.id.viewPagerOff)
        val fragmentList = arrayListOf(
            FlipCardFragment1Off(),
            FlipCardFragment2Off(),
            FlipCardFragment3Off(),
            FlipCardFragment4Off(),
            FlipCardFragment5Off(),
            FlipCardFragment6Off(),
            FlipCardFragment7Off(),
            FlipCardFragment8Off()
        )

        val adapter = ViewPagerAdapterFlipCardOff(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        viewPager.adapter = adapter

        return view
    }
}