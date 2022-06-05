package com.risingcamp.manu.deliveryserviceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.risingcamp.manu.deliveryserviceapp.databinding.ActivityMainRecyclerrReplaceBinding

class MainRecyclerrReplaceActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainRecyclerrReplaceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainRecyclerrReplaceBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.addTaskBtn.setOnClickListener {
//            intent.putExtra("addtask", addTask().toString())
//            startActivity(Intent(
//                this, MainActivity::class.java
//            ))
//        }


    }
    fun addTask() {

        val quicdata = QuickRecycler(
            R.drawable.bm_quick_img1,
            binding.resNameAdd.text.toString(),
            binding.resStarAdd.text.toString(),
            binding.resDeliverfeeAdd.text.toString(),
            binding.resDelivertimeAdd.text.toString()
        )

    }
}

