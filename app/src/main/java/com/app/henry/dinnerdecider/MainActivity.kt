package com.app.henry.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foods = arrayListOf("Chinese Food", "Pizza", "Hamburger", "McDonalds", "Tapioca", "Feijoada")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener{
            val random = Random()
            var chosenFood = random.nextInt(foods.count())
            selectedFoodTv.text = foods.get(chosenFood)
        }

        addFoodBtn.setOnClickListener{
            var newFood = FoodNameEd.text.toString()
            foods.add(newFood)
            FoodNameEd.text.clear()

        }


    }
}
