package com.app.smartshamba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.smartshamba.databinding.ActivityViewFarmActivitiesBinding

class ViewFarmActivities : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityViewFarmActivitiesBinding = ActivityViewFarmActivitiesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Generating A data source
        val activityName:Array<String> = arrayOf(
            "Planting Maize",
            "Sparing Tomatoes",
            "Harvesting Passion Fruit",
            "Feeding Rabbits",
            "Exporting Poultry",
            "Watering Onions"
        )
        val activityDate:Array<String> = arrayOf(
            "12, JUNE 2022",
            "30, JANE 2022",
            "10, JULY 2022",
            "01, AUG 2022",
            "11, AUG 2022",
            "02, SEP 2022"
        )
        val activityDes:Array<String> = arrayOf(
            "Maize",
            "Tomatoes",
            "Passion Fruit",
            "Rabbits",
            "Poultry",
            "Onions"
        )
        val weatherIcon:Array<Int> = arrayOf(
            R.drawable.fruits, R.drawable.fruits, R.drawable.fruits,
            R.drawable.fruits, R.drawable.fruits, R.drawable.fruits,
        )
        val activityWeather:Array<String> = arrayOf(
            "SUNNY",
            "STORM",
            "THUNDER STORM",
            "RAINNY",
            "SUNNY",
            "CLOUDY"
        )

        val gridView = binding.gridView

        val listOfArray:ArrayList<ActivitiesDataModels> = arrayListOf()

        for (i in activityName.indices){
            val activity = ActivitiesDataModels(activityName[i], activityDate[i], activityDes[i], weatherIcon[i],
                activityWeather[i])
            listOfArray.add(activity)
        }

        val adapter = ViewActivitiesAdapter(this, listOfArray)
        gridView.adapter = adapter

//        gridView.setOnClickListener {parent, view, position, id ->
//            val intent = Intent(this, InfoHubDetails::class.java)
//        }
    }
}