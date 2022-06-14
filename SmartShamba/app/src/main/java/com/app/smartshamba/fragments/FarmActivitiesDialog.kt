package com.app.smartshamba.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import com.app.smartshamba.ViewFarmActivities
import com.app.smartshamba.R

class FarmActivitiesDialog: DialogFragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_farm_activities_dialog, container, false)

        view.findViewById<Button>(R.id.viewActivitiesBtnId).setOnClickListener {
            startActivity(Intent(activity, ViewFarmActivities::class.java))
            dismiss()
        }

        return view
    }
}