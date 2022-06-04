package com.risingcamp.manu.deliveryserviceapp

import android.content.ClipData
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.view.MenuItem
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.risingcamp.manu.deliveryserviceapp.Adapter.DeilverChoiceAdapter
import com.risingcamp.manu.deliveryserviceapp.Adapter.FragmentMangAdapter
import com.risingcamp.manu.deliveryserviceapp.Adapter.MainViewPageAdapter
import com.risingcamp.manu.deliveryserviceapp.Adapter.MenuChoicePageAdapter
import com.risingcamp.manu.deliveryserviceapp.databinding.ActivityDeliveryMainBinding
import com.risingcamp.manu.deliveryserviceapp.mainFragment.DeliverFragment
import com.risingcamp.manu.deliveryserviceapp.mainFragment.DeliverOneFragment
import com.risingcamp.manu.deliveryserviceapp.mainFragment.PickUpFragment
import kotlinx.parcelize.Parcelize


class DeliveryMainActivity : AppCompatActivity() {

    private lateinit var Dbinding: ActivityDeliveryMainBinding
//    private var MainImageList = ArrayList<ImageData>()
//    private lateinit var MainviewPagerAdapter: MainViewPageAdapter
//    private var choiceImageList = ArrayList<ImageData>()
//    private lateinit var deliverChoiceAdapter : DeilverChoiceAdapter
//    private var mainMenuList = ArrayList<MainMenueData>()
//    private lateinit var menuChoiceAdapter : MenuChoicePageAdapter
    private lateinit var context: Context
    @Parcelize
    data class MainMenueData(
        var Imagesrc : Int,
        var title : String
        ) : Parcelable


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Dbinding = ActivityDeliveryMainBinding.inflate(layoutInflater)
        setContentView(Dbinding.root)


        val backToMain: ImageView = Dbinding.mainBackArrrow
//        val recyclerChoice : RecyclerView = Dbinding.menuChoiceRecycler

        backToMain.apply {
            setOnClickListener {
                startActivity(
                    Intent(this@DeliveryMainActivity, MainActivity::class.java)
                )
            }
        }

//        MainImageList.add(ImageData(R.drawable.main_ad_img1))
//        MainImageList.add(ImageData(R.drawable.main_ad_img2))
//        MainImageList.add(ImageData(R.drawable.main_ad_img3))
//        MainImageList.add(ImageData(R.drawable.main_ad_img4))
//
//        MainviewPagerAdapter = MainViewPageAdapter(MainImageList)
////
////        Dbinding.mainAdViewpager.apply {
////            adapter = MainviewPagerAdapter
////            orientation = ViewPager2.ORIENTATION_HORIZONTAL
////        }
//
//        deliverChoiceAdapter = DeilverChoiceAdapter(choiceImageList)
//
//        choiceImageList.add(ImageData(R.drawable.main_choice_img_01))
//        choiceImageList.add(ImageData(R.drawable.main_choice_img_02))
//        choiceImageList.add(ImageData(R.drawable.main_choice_img_03))
//        choiceImageList.add(ImageData(R.drawable.main_choice_img2_01))
//        choiceImageList.add(ImageData(R.drawable.main_choice_img2_02))
//        choiceImageList.add(ImageData(R.drawable.main_choice_img2_03))
//        choiceImageList.add(ImageData(R.drawable.main_choic_img3_01))
//        choiceImageList.add(ImageData(R.drawable.main_choic_img3_02))
//        choiceImageList.add(ImageData(R.drawable.main_choic_img3_03))
//
//
//
//
////        recyclerChoice.apply {
////            adapter = deliverChoiceAdapter
////            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
////        }
//
//        mainMenuList.add(MainMenueData(R.drawable.menu_main_deliver_01, "돈까스,회,일식"))
//        mainMenuList.add(MainMenueData(R.drawable.menu_main_deliver_02, "중식"))
//        mainMenuList.add(MainMenueData(R.drawable.menu_main_deliver_03, "치킨"))
//        mainMenuList.add(MainMenueData(R.drawable.menu_main_deliver_04, "백반,죽,국수"))
//        mainMenuList.add(MainMenueData(R.drawable.menu_main_deliver_05, "카페,디저트"))
//        mainMenuList.add(MainMenueData(R.drawable.menu_main_deliver_06, "분식"))
//        mainMenuList.add(MainMenueData(R.drawable.menu_main_deliver_07, "찜,탕,찌개"))
//        mainMenuList.add(MainMenueData(R.drawable.menu_main_deliver_08, "피자"))
//        mainMenuList.add(MainMenueData(R.drawable.menu_main_deliver_09, "양식"))
//        mainMenuList.add(MainMenueData(R.drawable.menu_main_deliver_10, "고기,구이"))
//        mainMenuList.add(MainMenueData(R.drawable.menu_main_deliver_11, "족발,보쌈"))
//        mainMenuList.add(MainMenueData(R.drawable.menu_main_deliver_12, "아시안"))
//        mainMenuList.add(MainMenueData(R.drawable.menu_main_deliver_13, "패스트푸드"))
//        mainMenuList.add(MainMenueData(R.drawable.menu_main_deliver_14, "야식"))
//        mainMenuList.add(MainMenueData(R.drawable.menu_main_deliver_15, "도시락"))
//        mainMenuList.add(MainMenueData(R.drawable.menu_main_deliver_16, "브랜드관"))
//        mainMenuList.add(MainMenueData(R.drawable.menu_main_deliver_17, "맛집랭킹"))
//        mainMenuList.add(MainMenueData(R.drawable.menu_main_deliver_20, ""))
//        mainMenuList.add(MainMenueData(R.drawable.menu_main_deliver_20, ""))
//        mainMenuList.add(MainMenueData(R.drawable.menu_main_deliver_20, ""))
//
//        menuChoiceAdapter = MenuChoicePageAdapter(mainMenuList)

//        Dbinding.menuRecyclerView.apply {
//            adapter = menuChoiceAdapter
//            layoutManager = GridLayoutManager(context, 5)
//        }

        val tabViewPage2 = Dbinding.tabViewpager2
        val mainTab = Dbinding.mainTab

        val fragmentAdapter = FragmentMangAdapter(this)
        tabViewPage2.adapter = fragmentAdapter

        val tabTitleList = listOf<String>("배달", "배민1", "포장", "B마트", "쇼핑라이브", "선물하기", "전국별미")

        TabLayoutMediator(mainTab, tabViewPage2, {tab, poisition -> tab.text = tabTitleList[poisition]}).attach(

        )

        Dbinding.btmNaviHombtn.apply {
            setOnClickListener{
                startActivity(Intent(this@DeliveryMainActivity, MainActivity::class.java))
            }

        }











    }

}