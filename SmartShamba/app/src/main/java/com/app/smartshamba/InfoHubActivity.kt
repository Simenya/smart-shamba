package com.app.smartshamba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import com.app.smartshamba.fragments.DiscoverDetailsFragment

class InfoHubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_hub_grid)

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
            R.drawable.maize, R.drawable.tomatoes2, R.drawable.passionfruit,
            R.drawable.rabbits, R.drawable.poultry, R.drawable.onions,
        )

        val gridView = findViewById<GridView>(R.id.infoGridViewId)

        val listOfArray:ArrayList<InfoHubModel> = arrayListOf()

        for (i in projName.indices){
            val grid = InfoHubModel(projName[i], projImage[i])
            listOfArray.add(grid)
        }

        val adapter = InfoHubAdapter(this, listOfArray)
        gridView.adapter = adapter

        gridView.setOnItemClickListener {parent, view, position, id ->
            val intent = Intent(this, DiscoverDetailsFragment::class.java)
            intent.putExtra("positon", position)
            startActivity(intent)
        }
    }
}