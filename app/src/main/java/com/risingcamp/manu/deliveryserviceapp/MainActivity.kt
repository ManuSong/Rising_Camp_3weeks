package com.risingcamp.manu.deliveryserviceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import androidx.viewpager2.widget.ViewPager2
import com.bumptech.glide.Glide
import com.risingcamp.manu.deliveryserviceapp.Adapter.ViewPagerAdapter
import com.risingcamp.manu.deliveryserviceapp.databinding.ActivityMainBinding
import com.risingcamp.manu.deliveryserviceapp.mainFragment.DeliverFragment
import com.risingcamp.manu.deliveryserviceapp.mainFragment.DeliverOneFragment
import com.risingcamp.manu.deliveryserviceapp.mainFragment.PickUpFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var ImageItemList = ArrayList<ImageData>()
    private lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Glide.with(this).load(R.raw.main_delivery_move).override(180,180).into(binding.bm1GifImg)

        ImageItemList.add(ImageData(R.drawable.main_ad_img1))
        ImageItemList.add(ImageData(R.drawable.main_ad_img2))
        ImageItemList.add(ImageData(R.drawable.main_ad_img3))
        ImageItemList.add(ImageData(R.drawable.main_ad_img4))


        viewPagerAdapter = ViewPagerAdapter(ImageItemList)

        binding.mainAdView.apply {
            adapter = viewPagerAdapter
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
        }

        binding.deliverySubTitle.apply {
            setOnClickListener {
                startActivity(
                    Intent(this@MainActivity, DeliveryMainActivity::class.java)
                )
            }
        }

        binding.bm1Container.apply {
            setOnClickListener {

            }
        }


    }




}

data class ImageData(val imageSrc : Int){}