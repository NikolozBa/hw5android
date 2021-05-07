package com.example.hw5android.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.hw5android.R

class SettingsFragment : Fragment(R.layout.fragment_settings){

    private lateinit var name: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        name = view.findViewById(R.id.settingsNameText)
        name.text = SettingsFragmentArgs.fromBundle(requireArguments()).fullName

    }
}