package com.elvitalya.drillershandbook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.elvitalya.drillershandbook.databinding.FragmentMainItemBinding
import com.elvitalya.drillershandbook.model.Themes
import com.elvitalya.drillershandbook.utils.APP_ACTIVITY
import com.elvitalya.drillershandbook.utils.THEME_NUMBER


class MainFragmentAdapter : RecyclerView.Adapter<MainFragmentAdapter.MainFragmentViewHolder>() {
    val themesList = ArrayList<Themes>()


    inner class MainFragmentViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = FragmentMainItemBinding.bind(item)
        fun bind(themes: Themes) {
            with(binding) {
                title.text = themes.title
                image.setImageResource(themes.image_id)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainFragmentViewHolder {
        val view =
            LayoutInflater.from(APP_ACTIVITY).inflate(R.layout.fragment_main_item, parent, false)
        return MainFragmentViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainFragmentViewHolder, position: Int) {
        holder.bind(themesList[position])
    }

    override fun getItemCount(): Int = themesList.size

    override fun onViewAttachedToWindow(holder: MainFragmentViewHolder) {
        holder.itemView.setOnClickListener {
            when (holder.adapterPosition){
                0 -> {
                    THEME_NUMBER = 0
                    APP_ACTIVITY.nav_controller.navigate(R.id.action_mainFragment_to_theme1Fragment)
                }
                1 ->{
                    THEME_NUMBER = 1
                    APP_ACTIVITY.nav_controller.navigate(R.id.action_mainFragment_to_theme1Fragment)
                }
                2 ->{
                    THEME_NUMBER = 2
                    APP_ACTIVITY.nav_controller.navigate(R.id.action_mainFragment_to_theme1Fragment)
                }
            }
        }
    }
}


















