package com.risingcamp.manu.deliveryserviceapp.Adapter

import android.util.SparseArray
import android.util.SparseBooleanArray
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.risingcamp.manu.deliveryserviceapp.ImageData
import com.risingcamp.manu.deliveryserviceapp.R

data class plusList(val eat : String, val won : String)

class PlusItemAdapter(val plusList : ArrayList<plusList>) : RecyclerView.Adapter<PlusItemAdapter.PlusChoiceAdapter>(){

    private val radioBoxStatus = SparseBooleanArray()

    inner class PlusChoiceAdapter(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.price_item, parent, false)
    ){
        val pluseat = itemView.findViewById<TextView>(R.id.howmany_eat)
        val pluswon = itemView.findViewById<TextView>(R.id.plus_won)

        val radiobox = itemView.findViewById<RadioButton>(R.id.radio_btn)

        fun onBindWith(plusList: plusList){
            pluseat.text = plusList.eat
            pluswon.text = plusList.won
            radiobox.isChecked = radioBoxStatus[adapterPosition]

            radiobox.setOnClickListener {
                if (!radiobox.isChecked) {
                    radioBoxStatus.put(adapterPosition, false)
                } else {
                    radioBoxStatus.put(adapterPosition, true)
                }
            notifyItemChanged(adapterPosition)}

        }
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PlusItemAdapter.PlusChoiceAdapter {
       return PlusChoiceAdapter((parent))
    }

    override fun onBindViewHolder(holder: PlusItemAdapter.PlusChoiceAdapter, position: Int) {
        if (holder is PlusChoiceAdapter) {
            holder.onBindWith(plusList[position])
        }
    }

    override fun getItemCount(): Int {
        return plusList.size
    }
}