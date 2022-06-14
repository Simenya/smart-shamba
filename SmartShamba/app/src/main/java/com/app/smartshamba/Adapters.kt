package com.app.smartshamba

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView


class InfoHubAdapter(val context: Context, val arrayList:ArrayList<InfoHubModel>):BaseAdapter(){

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return position.toLong()
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val layout = LayoutInflater.from(context).inflate(R.layout.info_hub_grid_item,parent,false)
        layout.findViewById<TextView>(R.id.projectNameId).text = arrayList[position].projectName
        layout.findViewById<ImageView>(R.id.projectImageId).setImageResource(arrayList[position].projectImage)

        return layout
    }

}

class ViewActivitiesAdapter(val context: Context, val arrayList:ArrayList<ActivitiesDataModels>):BaseAdapter(){

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return position.toLong()
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val layout = LayoutInflater.from(context).inflate(R.layout.view_activity_grid_item,parent,false)
        layout.findViewById<TextView>(R.id.activityNameId).text = arrayList[position].activityName
        layout.findViewById<TextView>(R.id.activityDateId).text = arrayList[position].activityDate
        layout.findViewById<TextView>(R.id.activityDescriptionId).text = arrayList[position].activityDescription
        layout.findViewById<ImageView>(R.id.activityWeatherIcon).setImageResource(arrayList[position].weatherIcon)
        layout.findViewById<TextView>(R.id.activityWeatherId).text = arrayList[position].activityWeather


        return layout
    }

}