package com.elvitalya.drillershandbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.elvitalya.drillershandbook.databinding.ActivityMainBinding
import com.elvitalya.drillershandbook.utils.APP_ACTIVITY
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.invoke
import kotlinx.coroutines.launch
import kotlin.concurrent.fixedRateTimer


class MainActivity : AppCompatActivity() {

    lateinit var nav_controller: NavController
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        APP_ACTIVITY = this
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        nav_controller = Navigation.findNavController(this, R.id.nav_host_fragment)

    }

    override fun onResume() {
        super.onResume()
        GlobalScope.launch{
            Dispatchers.IO{
                Thread.sleep(3000)
            }
            Dispatchers.Main{
                binding.startImage.visibility = View.GONE
            }
        }
    }






}