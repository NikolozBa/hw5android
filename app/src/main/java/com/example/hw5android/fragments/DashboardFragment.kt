package com.example.hw5android.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.hw5android.R

class DashboardFragment : Fragment(R.layout.fragment_dashboard){

    private lateinit var dashText:TextView
    private lateinit var dashEditText: EditText
    private lateinit var dashButton: Button

    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        dashText = view.findViewById(R.id.dashText)
        dashEditText = view.findViewById(R.id.dashEditText)
        dashButton = view.findViewById(R.id.dashButton)

        navController = Navigation.findNavController(view)


        dashText.text = DashboardFragmentArgs.fromBundle(requireArguments()).amount.toString()


        dashButton.setOnClickListener {

            if(dashEditText.text.isNotEmpty()){

                navController.navigate(DashboardFragmentDirections.actionDashboardFragmentToSettingsFragment(dashEditText.text.toString()))
            }

        }


    }

}