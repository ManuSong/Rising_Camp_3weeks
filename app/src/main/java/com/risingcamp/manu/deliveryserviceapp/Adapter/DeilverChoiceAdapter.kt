package com.risingcamp.manu.deliveryserviceapp.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.risingcamp.manu.deliveryserviceapp.ImageData
import com.risingcamp.manu.deliveryserviceapp.R

class DeilverChoiceAdapter(var choiceImageList : ArrayList<ImageData>) :
    RecyclerView.Adapter<DeilverChoiceAdapter.DeliverChoiceAdapter>() {

    inner class DeliverChoiceAdapter(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.main_deliver_choice_item, parent, false)
    ) {
        var deilverChoice = itemView.findViewById<ImageView>(R.id.deliver_choice_img)

        fun bindWithView(imageList : ImageData){
            deilverChoice.setImageResource(imageList.imageSrc)
        }

    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DeilverChoiceAdapter.DeliverChoiceAdapter {
        return DeliverChoiceAdapter((parent))
    }

    override fun onBindViewHolder(
        holder: DeilverChoiceAdapter.DeliverChoiceAdapter,
        position: Int
    ) {
        holder.bindWithView(choiceImageList[position])
    }

    override fun getItemCount(): Int {
        return choiceImageList.size
    }


}