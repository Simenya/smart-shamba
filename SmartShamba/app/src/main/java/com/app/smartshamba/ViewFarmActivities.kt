package com.app.smartshamba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.GridView
import com.app.smartshamba.fragments.FarmActivitiesDialog
import com.app.smartshamba.fragments.ViewActivityDetailsFragment

class ViewFarmActivities : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_farm_activities)

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
            R.drawable.sun, R.drawable.storm, R.drawable.thunderstorm,
            R.drawable.rainy, R.drawable.sun, R.drawable.cloudy,
        )
        val activityWeather:Array<String> = arrayOf(
            "SUNNY",
            "STORM",
            "THUNDER STORM",
            "RAINY",
            "SUNNY",
            "CLOUDY"
        )

        val gridView = findViewById<GridView>(R.id.gridView)

        val listOfArray:ArrayList<ActivitiesDataModels> = arrayListOf()

        for (i in activityName.indices){
            val activity = ActivitiesDataModels(activityName[i], activityDate[i], activityDes[i], weatherIcon[i],
                activityWeather[i])
            listOfArray.add(activity)
        }

        val adapter = ViewActivitiesAdapter(this, listOfArray)
        gridView.adapter = adapter

        gridView.setOnItemClickListener { parent, view, position, id ->
            var dialog = ViewActivityDetailsFragment()

            dialog.show(supportFragmentManager, "Activities")
        }
    }
}