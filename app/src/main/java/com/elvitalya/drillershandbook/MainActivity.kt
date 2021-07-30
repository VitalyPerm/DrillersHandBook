package com.elvitalya.drillershandbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.elvitalya.drillershandbook.databinding.ActivityMainBinding
import com.elvitalya.drillershandbook.utils.APP_ACTIVITY
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.invoke
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    lateinit var nav_controller: NavController
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        APP_ACTIVITY = this
        nav_controller = Navigation.findNavController(this, R.id.nav_host_fragment)

    }

    override fun onResume() {
        super.onResume()
        GlobalScope.launch{
            Dispatchers.IO{
                Thread.sleep(3000)
            }
            Dispatchers.Main{
                nav_controller.navigate(R.id.action_startFragment_to_mainFragment)
            }
        }
    }




}