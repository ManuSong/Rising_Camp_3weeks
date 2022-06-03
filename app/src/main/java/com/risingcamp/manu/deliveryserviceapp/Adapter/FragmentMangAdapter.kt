package com.risingcamp.manu.deliveryserviceapp.Adapter

import androidx.fragment.app.*
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.risingcamp.manu.deliveryserviceapp.mainFragment.*

class FragmentMangAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    private var fragmentList = listOf<Fragment>(DeliverFragment(), DeliverOneFragment(), PickUpFragment(), BmartFragment(), ShoppingLiveFragment(), ToGiftFragment(), NationalFoddFragment())


    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }


}