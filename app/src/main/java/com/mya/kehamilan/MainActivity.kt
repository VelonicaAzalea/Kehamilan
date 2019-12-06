package com.mya.kehamilan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        info_btn.setOnClickListener(){
            intent = Intent (this,info::class.java)
            startActivity(intent)
        }

        or_btn.setOnClickListener(){
            intent = Intent (this,or::class.java)
            startActivity(intent)
        }

        nutri_btn.setOnClickListener(){
            intent = Intent (this,gizi::class.java)
            startActivity(intent)
        }
    }
}
