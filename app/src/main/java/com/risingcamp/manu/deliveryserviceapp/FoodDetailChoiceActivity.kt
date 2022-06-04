package com.risingcamp.manu.deliveryserviceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.risingcamp.manu.deliveryserviceapp.Adapter.PlusCheckAdapter
import com.risingcamp.manu.deliveryserviceapp.Adapter.PlusItemAdapter
import com.risingcamp.manu.deliveryserviceapp.Adapter.checkList
import com.risingcamp.manu.deliveryserviceapp.Adapter.plusList
import com.risingcamp.manu.deliveryserviceapp.databinding.ActivityFoodDetailChoiceBinding

class FoodDetailChoiceActivity : AppCompatActivity() {
    private lateinit var FDbinding : ActivityFoodDetailChoiceBinding
    private var plusLists = ArrayList<plusList>()
    private lateinit var plusAdapter : PlusItemAdapter
    private var checklist = ArrayList<checkList>()
    private lateinit var plusCheckAdapter: PlusCheckAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FDbinding = ActivityFoodDetailChoiceBinding.inflate(layoutInflater)
        setContentView(FDbinding.root)

        plusLists.add(plusList("2인분(1인분 +)", "19,000원"))
        plusLists.add(plusList("2인분(1인분 +)", "28,500원"))

        plusAdapter = PlusItemAdapter(plusLists)

        FDbinding.priceRecycler.apply {
            adapter = plusAdapter
        }

        checklist.add(checkList("햄사리 추가", "3,500원"))
        checklist.add(checkList("소세지사리 추가", "3,500원"))
        checklist.add(checkList("햄소세지사리 추가", "3,500원"))
        checklist.add(checkList("신라면사리 추가", "1,500원"))
        checklist.add(checkList("야채 추가", "1,000원"))
        checklist.add(checkList("김치양념장추가", "500원"))

        plusCheckAdapter = PlusCheckAdapter(checklist)

        FDbinding.addChoiceRecycler.apply {
            adapter = plusCheckAdapter
        }

    }
}