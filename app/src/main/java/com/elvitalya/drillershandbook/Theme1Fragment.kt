package com.elvitalya.drillershandbook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.elvitalya.drillershandbook.databinding.FragmentTheme1Binding
import com.elvitalya.drillershandbook.utils.THEME_NUMBER


class Theme1Fragment : Fragment() {
    lateinit var binding: FragmentTheme1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = FragmentTheme1Binding.inflate(layoutInflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        when(THEME_NUMBER){
            0 -> binding.contentImageView.setImageResource(R.drawable.theme1_content)
        }

    }





}