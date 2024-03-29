package com.app.smartshamba.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.smartshamba.InfoHubActivity
import com.app.smartshamba.ViewFarmActivities
import com.app.smartshamba.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding:FragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater)

        binding.infoHubId.setOnClickListener {
            startActivity(Intent(activity, InfoHubActivity::class.java))
        }
        binding.seeAllActivitiesId.setOnClickListener {
            startActivity(Intent(activity, ViewFarmActivities::class.java))
        }
        return binding.root
    }

}