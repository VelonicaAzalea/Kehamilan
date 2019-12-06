package com.mya.kehamilan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_info.*


class info : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        back_info.setOnClickListener(){
            intent = Intent (this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
