package com.elvitalya.drillershandbook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.elvitalya.drillershandbook.databinding.FragmentThemeBinding
import com.elvitalya.drillershandbook.utils.THEME_NUMBER


class ThemeFragment : Fragment() {
    lateinit var binding: FragmentThemeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = FragmentThemeBinding.inflate(layoutInflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        when(THEME_NUMBER){
            0 -> {
                binding.contentImageView.setImageResource(R.drawable.about_content)
            }
            1 -> {
                binding.contentImageView.setImageResource(R.drawable.theme_1_content)
            }
            2 -> {
                binding.contentImageView.setImageResource(R.drawable.theme2original_compressed)
            }
            3 -> {
                binding.contentImageView.setImageResource(R.drawable.theme3_content)
            }

        }

    }





}