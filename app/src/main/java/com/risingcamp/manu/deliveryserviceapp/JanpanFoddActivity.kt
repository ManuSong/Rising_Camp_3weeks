package com.risingcamp.manu.deliveryserviceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.risingcamp.manu.deliveryserviceapp.databinding.ActivityJanpanFoddBinding

class JanpanFoddActivity : AppCompatActivity() {
    private lateinit var Jbinding : ActivityJanpanFoddBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Jbinding = ActivityJanpanFoddBinding.inflate(layoutInflater)
        setContentView(Jbinding.root)

        val titleText = intent.getStringExtra("title")

        Jbinding.titleChange.text = titleText.toString()
    }
}