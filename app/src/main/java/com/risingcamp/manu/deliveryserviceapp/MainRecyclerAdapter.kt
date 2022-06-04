package com.risingcamp.manu.deliveryserviceapp

import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class MainRecyclerAdapter(var quickData : ArrayList<QuickRecycler>) : RecyclerView.Adapter<MainRecyclerAdapter.QuickHolder>() {


    inner class QuickHolder(parent: View) : RecyclerView.ViewHolder(parent) {
        val foodImage : ImageView = itemView.findViewById(R.id.main_food_img)
       val restrantName : TextView = itemView.findViewById(R.id.restrant_name)
       val deliverTip : TextView = itemView.findViewById(R.id.deliver_tip)
        val deliverFee : TextView = itemView.findViewById(R.id.deliver_fee)
//        val bm1TimeBar : ConstraintLayout = itemView.findViewById(R.id.bm1_time_bar)
        val bm1Img : ImageView = itemView.findViewById(R.id.bm1_img)
        val bm1Time : TextView = itemView.findViewById(R.id.main_bm1_time)
        val mainStar : ImageView = itemView.findViewById(R.id.main_star)
        val starNum : TextView = itemView.findViewById(R.id.star_number)

        fun bindWithMainView(quickData : QuickRecycler) {
            foodImage.setImageResource(quickData.imagesrc)
            restrantName.text = quickData.restrantName
            deliverFee.text = quickData.deliverFee
            bm1Time.text = quickData.deliverTime
            starNum.text = quickData.StarNum
            itemView.setOnClickListener {
                val intent = Intent(itemView.context, FoodMenuActivity::class.java)


                intent.putExtra("resname", restrantName.text)
                intent.putExtra("deliverFee", deliverFee.text)
                intent.putExtra("bm1Time", bm1Time.text)
                intent.putExtra("starNum", starNum.text)



                intent.run { itemView.context.startActivity(intent) }
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuickHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_recycle_item, parent, false)
        return QuickHolder(view)
    }

    override fun onBindViewHolder(holder: QuickHolder, position: Int) {
        holder.bindWithMainView(quickData[position])
    }

    override fun getItemCount(): Int {
        return quickData.size
    }

    interface OnItemClickListener{
        fun Onclick(v:View, position: Int)
    }

    private lateinit var itemClickListener: OnItemClickListener

    fun setItemClickListener(itemClickListener: OnItemClickListener){
        this.itemClickListener = itemClickListener
    }




}