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

        binding.loginBtn.setOnClickListener {
            val inputid = binding.idEdt.text.toString()
            val inputpassword = binding.passwordEdt.text.toString()

            if(inputid == "admin@test.com" && inputpassword == "qwer") {
                Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }

        }





    }
}