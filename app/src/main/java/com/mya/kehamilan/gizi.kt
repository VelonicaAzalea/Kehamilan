package com.mya.kehamilan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_gizi.*
import android.content.Intent


class gizi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gizi)

        back_gz.setOnClickListener(){
            intent = Intent (this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
