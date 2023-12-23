package com.example.loginui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log //추가
import android.widget.Toast //추가
import com.example.loginui.databinding.ActivityMainBinding //추가



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding //추가
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate((layoutInflater))  //추가
        setContentView(binding.root) //변경





    }
}