package com.risingcamp.manu.deliveryserviceapp.mainFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.risingcamp.manu.deliveryserviceapp.Adapter.DeilverChoiceAdapter
import com.risingcamp.manu.deliveryserviceapp.Adapter.MainViewPageAdapter
import com.risingcamp.manu.deliveryserviceapp.Adapter.MenuChoicePageAdapter
import com.risingcamp.manu.deliveryserviceapp.DeliveryMainActivity
import com.risingcamp.manu.deliveryserviceapp.ImageData
import com.risingcamp.manu.deliveryserviceapp.R


class DeliverFragment : Fragment() {

    private var MainImages = ArrayList<ImageData>()
    private lateinit var MainviewPagerAdapter: MainViewPageAdapter
    private var choiceImages = ArrayList<ImageData>()
    private lateinit var deliverChoiceAdapter : DeilverChoiceAdapter
    private var mainMenus = ArrayList<DeliveryMainActivity.MainMenueData>()
    private lateinit var menuChoiceAdapter : MenuChoicePageAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view : View = inflater.inflate(R.layout.activity_deliver_fragment, container, false)

        MainImages.add(ImageData(R.drawable.main_ad_img1))
        MainImages.add(ImageData(R.drawable.main_ad_img2))
        MainImages.add(ImageData(R.drawable.main_ad_img3))
        MainImages.add(ImageData(R.drawable.main_ad_img4))

        MainviewPagerAdapter = MainViewPageAdapter(MainImages)

        val mainViewPager = view.findViewById<ViewPager2>(R.id.main_ad_viewpager)

        mainViewPager.apply {
            adapter = MainviewPagerAdapter
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
        }

        deliverChoiceAdapter = DeilverChoiceAdapter(choiceImages)

        choiceImages.add(ImageData(R.drawable.main_choice_img_01))
        choiceImages.add(ImageData(R.drawable.main_choice_img_02))
        choiceImages.add(ImageData(R.drawable.main_choice_img_03))
        choiceImages.add(ImageData(R.drawable.main_choice_img2_01))
        choiceImages.add(ImageData(R.drawable.main_choice_img2_02))
        choiceImages.add(ImageData(R.drawable.main_choice_img2_03))
        choiceImages.add(ImageData(R.drawable.main_choic_img3_01))
        choiceImages.add(ImageData(R.drawable.main_choic_img3_02))
        choiceImages.add(ImageData(R.drawable.main_choic_img3_03))


        val recyclerChoice = view.findViewById<RecyclerView>(R.id.menu_choice_recycler)

        recyclerChoice.apply {
            adapter = deliverChoiceAdapter
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        }

        mainMenus.add(
            DeliveryMainActivity.MainMenueData(
                R.drawable.menu_main_deliver_01,
                "?????????,???,??????"
            )
        )
        mainMenus.add(DeliveryMainActivity.MainMenueData(R.drawable.menu_main_deliver_02, "??????"))
        mainMenus.add(DeliveryMainActivity.MainMenueData(R.drawable.menu_main_deliver_03, "??????"))
        mainMenus.add(
            DeliveryMainActivity.MainMenueData(
                R.drawable.menu_main_deliver_04,
                "??????,???,??????"
            )
        )
        mainMenus.add(
            DeliveryMainActivity.MainMenueData(
                R.drawable.menu_main_deliver_05,
                "??????,?????????"
            )
        )
        mainMenus.add(DeliveryMainActivity.MainMenueData(R.drawable.menu_main_deliver_06, "??????"))
        mainMenus.add(
            DeliveryMainActivity.MainMenueData(
                R.drawable.menu_main_deliver_07,
                "???,???,??????"
            )
        )
        mainMenus.add(DeliveryMainActivity.MainMenueData(R.drawable.menu_main_deliver_08, "??????"))
        mainMenus.add(DeliveryMainActivity.MainMenueData(R.drawable.menu_main_deliver_09, "??????"))
        mainMenus.add(
            DeliveryMainActivity.MainMenueData(
                R.drawable.menu_main_deliver_10,
                "??????,??????"
            )
        )
        mainMenus.add(
            DeliveryMainActivity.MainMenueData(
                R.drawable.menu_main_deliver_11,
                "??????,??????"
            )
        )
        mainMenus.add(DeliveryMainActivity.MainMenueData(R.drawable.menu_main_deliver_12, "?????????"))
        mainMenus.add(
            DeliveryMainActivity.MainMenueData(
                R.drawable.menu_main_deliver_13,
                "???????????????"
            )
        )
        mainMenus.add(DeliveryMainActivity.MainMenueData(R.drawable.menu_main_deliver_14, "??????"))
        mainMenus.add(DeliveryMainActivity.MainMenueData(R.drawable.menu_main_deliver_15, "?????????"))
        mainMenus.add(
            DeliveryMainActivity.MainMenueData(
                R.drawable.menu_main_deliver_16,
                "????????????"
            )
        )
        mainMenus.add(
            DeliveryMainActivity.MainMenueData(
                R.drawable.menu_main_deliver_17,
                "????????????"
            )
        )
        mainMenus.add(DeliveryMainActivity.MainMenueData(R.drawable.menu_main_deliver_20, ""))
        mainMenus.add(DeliveryMainActivity.MainMenueData(R.drawable.menu_main_deliver_20, ""))
        mainMenus.add(DeliveryMainActivity.MainMenueData(R.drawable.menu_main_deliver_20, ""))

        menuChoiceAdapter = MenuChoicePageAdapter(mainMenus)

        val menuRecyclerView = view.findViewById<RecyclerView>(R.id.menu_recycler_view)

        menuRecyclerView.apply {
            adapter = menuChoiceAdapter
            layoutManager = GridLayoutManager(context, 5)

        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        MainImages.clear()
        mainMenus.clear()
        choiceImages.clear()
    }

}