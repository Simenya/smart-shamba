package com.app.smartshamba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.smartshamba.databinding.ActivityInfoHubGridBinding

class InfoHubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityInfoHubGridBinding = ActivityInfoHubGridBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Generating A data source
        val projName:Array<String> = arrayOf(
            "Maize",
            "Tomatoes",
            "Passion Fruit",
            "Rabbits",
            "Poultry",
            "Onions"
        )
        val projImage:Array<Int> = arrayOf(
            R.drawable.fruits, R.drawable.fruits, R.drawable.fruits,
            R.drawable.fruits, R.drawable.fruits, R.drawable.fruits,
        )

        val gridView = binding.infoGridViewId

        val listOfArray:ArrayList<InfoHubModel> = arrayListOf()

        for (i in projName.indices){
            val grid = InfoHubModel(projName[i], projImage[i])
            listOfArray.add(grid)
        }

        val adapter = InfoHubAdapter(this, listOfArray)
        gridView.adapter = adapter

//        gridView.setOnClickListener {parent, view, position, id ->
//            val intent = Intent(this, InfoHubDetails::class.java)
//        }
    }
}