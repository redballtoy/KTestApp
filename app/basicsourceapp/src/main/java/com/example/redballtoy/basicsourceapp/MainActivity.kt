package com.example.redballtoy.basicsourceapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var tvShowResult: TextView
    lateinit var btShowToast: Button
    lateinit var btIncreaseValue: Button
    lateinit var btSetRandomValue: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvShowResult=findViewById(R.id.tv_show_count)
        btShowToast=findViewById(R.id.bt_toast)
        btIncreaseValue=findViewById(R.id.bt_count)
        btSetRandomValue=findViewById(R.id.bt_random)

        btSetRandomValue.setOnClickListener {
            val randomValue = Random(10).nextInt().toString()
            tvShowResult.text = randomValue
        }

        btShowToast.setOnClickListener {
            val resultShow = tvShowResult.text.toString()
            Toast.makeText(this,"Result is: $resultShow",Toast.LENGTH_SHORT).show()
        }

        btIncreaseValue.setOnClickListener {
            var result = Integer.parseInt(tvShowResult.text.toString())//.toInt()
            var result2 = (tvShowResult.text.toString()).toInt()
            result++
            tvShowResult.text=result.toString()
        }



    }


}