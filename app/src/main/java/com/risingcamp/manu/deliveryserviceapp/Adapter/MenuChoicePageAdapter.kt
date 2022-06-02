package com.risingcamp.manu.deliveryserviceapp.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.risingcamp.manu.deliveryserviceapp.DeliveryMainActivity
import com.risingcamp.manu.deliveryserviceapp.R

class MenuChoicePageAdapter(var menuChoiceList : ArrayList<DeliveryMainActivity.MainMenueData>) : RecyclerView.Adapter<MenuChoicePageAdapter.MenuChoiceAdapter>() {

    inner class MenuChoiceAdapter(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.menu_choice_item, parent, false)
    ){
        val menuImg = itemView.findViewById<ImageView>(R.id.menu_img)
        val menuText = itemView.findViewById<TextView>(R.id.menu_text)

        fun onBindWith(menuChoiceList : DeliveryMainActivity.MainMenueData) {
            menuImg.setImageResource(menuChoiceList.Imagesrc)
            menuText.text = menuChoiceList.title
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MenuChoicePageAdapter.MenuChoiceAdapter {
        return MenuChoiceAdapter((parent))
    }

    override fun onBindViewHolder(holder: MenuChoicePageAdapter.MenuChoiceAdapter, position: Int) {
        holder.onBindWith(menuChoiceList[position])
    }

    override fun getItemCount(): Int {
        return menuChoiceList.size
    }
}