package com.risingcamp.manu.deliveryserviceapp

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.risingcamp.manu.deliveryserviceapp.databinding.ActivityFoodMenuBinding

class FoodMenuActivity : AppCompatActivity() {
    private lateinit var fbinding : ActivityFoodMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fbinding = ActivityFoodMenuBinding.inflate(layoutInflater)
        setContentView(fbinding.root)

//        intent.putExtra("resname", restrantName.text)
//        intent.putExtra("imgsrc", foodImage.setImageResource(quickData.imagesrc).toString())
//        intent.putExtra("deliverFee", deliverFee.text)
//        intent.putExtra("bm1Time", bm1Time.text)
//        intent.putExtra("starNum", starNum.text)


        val restitle = intent.getStringExtra("resname")
        val deliverFee = intent.getStringExtra("deliverFee")
        val bm1Time = intent.getStringExtra("bm1Time")
        val starNum = intent.getStringExtra("starNum")

        fbinding.resMenuName.text = restitle.toString()
        fbinding.resDeliverFee.text = deliverFee.toString()
        fbinding.resDeliver.text = bm1Time.toString()
        fbinding.resStarText.text = starNum.toString()

        fbinding.menuChoiceDetail.apply {
            setOnClickListener {
                startActivity(Intent(this@FoodMenuActivity, FoodDetailChoiceActivity::class.java))
            }
        }


    }
}