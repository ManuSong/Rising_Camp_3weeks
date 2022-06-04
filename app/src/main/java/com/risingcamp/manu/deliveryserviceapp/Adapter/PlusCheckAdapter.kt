package com.risingcamp.manu.deliveryserviceapp.Adapter

import android.util.SparseBooleanArray
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.risingcamp.manu.deliveryserviceapp.R

data class checkList(val addtitle : String, val addWon : String)

class PlusCheckAdapter(val checkLists : ArrayList<checkList>) : RecyclerView.Adapter<PlusCheckAdapter.PlusAddAdapter>() {

    private var checkBoxStatus = SparseBooleanArray()

    inner class PlusAddAdapter(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.plus_check_item, parent, false)
    ) {
        val addtitle = itemView.findViewById<TextView>(R.id.add_detail)
        val addwon = itemView.findViewById<TextView>(R.id.add_won)
        val checkboxs = itemView.findViewById<CheckBox>(R.id.add_check)

        fun onbindWith(chekList: checkList) {
            addtitle.text = chekList.addtitle
            addwon.text = chekList.addWon
            checkboxs.isChecked = checkBoxStatus[position]

            checkboxs.setOnClickListener {
                if(!checkboxs.isChecked) {
                    checkBoxStatus.put(adapterPosition, false)
                } else {
                    checkBoxStatus.put(adapterPosition, true)
                }
                notifyItemChanged(adapterPosition)
            }

        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PlusCheckAdapter.PlusAddAdapter {
        return PlusAddAdapter((parent))
    }

    override fun onBindViewHolder(holder: PlusCheckAdapter.PlusAddAdapter, position: Int) {
        if (holder is PlusAddAdapter) {
            holder.onbindWith(checkLists[position])
        }
    }

    override fun getItemCount(): Int {
        return checkLists.size
    }
}