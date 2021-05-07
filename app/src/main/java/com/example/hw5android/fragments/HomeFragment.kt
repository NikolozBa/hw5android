package com.example.hw5android.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.hw5android.R

class HomeFragment : Fragment(R.layout.fragment_home){

    private lateinit var editText: EditText
    private lateinit var submitButton: Button
    private lateinit var notifButton: Button

    private lateinit var navController: NavController


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editText = view.findViewById(R.id.homeEditText)
        submitButton = view.findViewById(R.id.homeButtonSub)
        notifButton = view.findViewById(R.id.homeButtonNot)

        navController = Navigation.findNavController(view)

        submitButton.setOnClickListener {
            var amount = -1

            if(editText.text.isNotEmpty()){
                amount = editText.text.toString().toInt()
            }

            //val action = HomeFragmentDirections.actionHomeFragmentToDashboardFragment(amount)
            navController.navigate(HomeFragmentDirections.actionHomeFragmentToDashboardFragment(amount))


        }

        notifButton.setOnClickListener {
            navController.navigate(HomeFragmentDirections.actionHomeFragmentToNotificationsFragment())
        }

    }

}