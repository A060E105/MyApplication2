package com.example.i5302.myapplication2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btn_send.setOnClickListener {
            if (ed_drink.length() < 1) {
                Toast.makeText(this, "請輸入飲料名稱", Toast.LENGTH_SHORT).show()
            } else {
                val b = Bundle()

                b.putString("drink", ed_drink.text.toString())
                b.putString("sweet", radioGroup.findViewById<RadioButton>(radioGroup.checkedRadioButtonId).text.toString())
            }
        }
    }
}
