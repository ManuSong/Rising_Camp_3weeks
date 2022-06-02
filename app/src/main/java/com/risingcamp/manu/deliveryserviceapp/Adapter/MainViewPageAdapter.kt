package com.risingcamp.manu.deliveryserviceapp.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.risingcamp.manu.deliveryserviceapp.ImageData
import com.risingcamp.manu.deliveryserviceapp.R

class MainViewPageAdapter(var mainImageList : ArrayList<ImageData>) : RecyclerView.Adapter<MainViewPageAdapter.MainPagerAdapter>() {

    inner class MainPagerAdapter(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.main_view_pager_item, parent, false)
    ) {

        val mainDeliver = itemView.findViewById<ImageView>(R.id.main_deliver_ad)

        fun onBindWith(mainImageList: ImageData) {
            mainDeliver.setImageResource(mainImageList.imageSrc)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainPagerAdapter {
        return MainPagerAdapter((parent))
    }

    override fun onBindViewHolder(holder: MainPagerAdapter, position: Int) {
        holder.onBindWith(mainImageList[position])
    }

    override fun getItemCount(): Int {
        return mainImageList.size
    }


}