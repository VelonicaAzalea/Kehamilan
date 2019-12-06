package com.mya.kehamilan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_or.*


class or : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_or)

        back_or.setOnClickListener(){
            intent = Intent (this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
