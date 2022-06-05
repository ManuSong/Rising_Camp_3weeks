package com.risingcamp.manu.deliveryserviceapp

import android.content.DialogInterface
import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.bumptech.glide.Glide
import com.risingcamp.manu.deliveryserviceapp.Adapter.ViewPagerAdapter
import com.risingcamp.manu.deliveryserviceapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var ImageItemList = ArrayList<ImageData>()
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private var quickRecycler = ArrayList<QuickRecycler>()
    private lateinit var mainRecyclerAdapter: MainRecyclerAdapter

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

        quickRecycler.add(QuickRecycler(R.drawable.bm_quick_img1, "한독대 김치찜 장안점", "5.0", "3,000원", "15~20분"))
        quickRecycler.add(QuickRecycler(R.drawable.bm_quick_img2, "박네집송탄부대찌개 장안팔달", "4.9", "3,000~4,000원", "10~15분"))
        quickRecycler.add(QuickRecycler(R.drawable.bm_quick_img3, "덮밥전문점 고칸 수원 장안팔달", "4.3", "3,500원", "15~30분"))
        quickRecycler.add(QuickRecycler(R.drawable.bm_quick_img4, "포메인 천천점", "4.7", "2,500원", "15~25분"))
        quickRecycler.add(QuickRecycler(R.drawable.bm_quick_img5, "고피자 1인피자 수원장안팔달", "4.9", "2,500원", "5~10분"))
        quickRecycler.add(QuickRecycler(R.drawable.bm_quick_img6, "가마로강정 성균관대점", "4.8", "4,000원", "12~18분"))
        quickRecycler.add(QuickRecycler(R.drawable.bm_quick_img7, "화이트스노우 빙수 성균관대", "5.0", "3,500원", "18~30분"))




        mainRecyclerAdapter = MainRecyclerAdapter(quickRecycler)

        binding.mainQuickDeliveryRecycle.apply {
            adapter = mainRecyclerAdapter
        }

        binding.deliverContainer.apply {
            setOnClickListener {
                startActivity(Intent(this@MainActivity, DeliveryMainActivity::class.java))
            }
        }


    }



}

data class ImageData(val imageSrc : Int){}