package com.example.i5302.myapplication2

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_choice.setOnClickListener {
            startActivityForResult(Intent(this, Main2Activity::class.java), 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        data?.extras?.let {
            if (requestCode==1 && resultCode== Activity.RESULT_OK) {
                tv_drink.text = "飲料： ${it.getString("drink")}"
                tv_sweet.text = "甜度： ${it.getString("sweet")}"
                tv_ice.text = "冰塊： ${it.getString("ice")}"
            }
        }
    }
}
