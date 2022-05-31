package com.risingcamp.manu.deliveryserviceapp

import android.graphics.drawable.Drawable
import android.media.Image
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ViewPagerAdapter(val imageList : ArrayList<ImageData>) : RecyclerView.Adapter<ViewPagerAdapter.PagerHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPagerAdapter.PagerHolder {
        return PagerHolder((parent))
    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.PagerHolder, position: Int) {
      holder.bindWithView(imageList[position])
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    inner class PagerHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.viewpager_item_list, parent, false)
    ){

        val mainAd = itemView.findViewById<ImageView>(R.id.main_ad_img)!!

        fun bindWithView(imageList : ImageData){
            mainAd.setImageResource(imageList.imageSrc)
        }

    }
}