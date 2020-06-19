package com.example.musicdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        play_btn.setOnClickListener(this)
        pause_btn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v==play_btn){
            val intent= Intent(this,MyService::class.java)
            startService(intent)

        }
        else if (v==pause_btn){
            val intent=Intent(this,MyService::class.java)
            stopService(intent)
        }

    }
}