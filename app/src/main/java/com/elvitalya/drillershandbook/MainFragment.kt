package com.elvitalya.drillershandbook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.elvitalya.drillershandbook.databinding.FragmentMainBinding
import com.elvitalya.drillershandbook.model.addThemes
import com.elvitalya.drillershandbook.utils.APP_ACTIVITY

class MainFragment : Fragment() {
    private lateinit var rv: RecyclerView
    private lateinit var toolbar: androidx.appcompat.widget.Toolbar
    private lateinit var bind: FragmentMainBinding
    private val adapter = MainFragmentAdapter()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = FragmentMainBinding.inflate(layoutInflater, container, false)
        return bind.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar = bind.mainToolbar
        APP_ACTIVITY.setSupportActionBar(toolbar)
        rv = bind.fragmentMainRv
        rv.layoutManager = LinearLayoutManager(APP_ACTIVITY)
        rv.adapter = adapter
        if (adapter.themesList.isEmpty()){
            adapter.themesList.addAll(addThemes())
        }



    }


}
