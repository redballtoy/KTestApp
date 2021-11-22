package com.example.redballtoy.basicsourceapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var tvShowResult: TextView
    lateinit var btShowToast: Button
    lateinit var btIncreaseValue: Button
    lateinit var btSetRandomValue: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvShowResult = findViewById(R.id.tv_show_count)
        btShowToast = findViewById(R.id.bt_toast)
        btIncreaseValue = findViewById(R.id.bt_count)
        btSetRandomValue = findViewById(R.id.bt_random)


        btShowToast.setOnClickListener {
            val resultShow = tvShowResult.text.toString()
            Toast.makeText(this, "Result is: $resultShow", Toast.LENGTH_SHORT).show()
        }

        btIncreaseValue.setOnClickListener {
            var result = Integer.parseInt(tvShowResult.text.toString())//.toInt()
            var result2 = (tvShowResult.text.toString()).toInt()
            result++
            tvShowResult.text = result.toString()
        }

        btSetRandomValue.setOnClickListener {
            showRandomValueOnNewActivity(it)
        }


    }

    //this function invoke by button pass and show random number value in
    //new activity, who will be between 0 and current count value
    private fun showRandomValueOnNewActivity(view: View) {
        val randomIntent = Intent(this, ShowRandomValue::class.java)

        val currentCountValue = tvShowResult.text.toString().toInt()
        randomIntent.putExtra(ShowRandomValue.TOTAL_COUNT, currentCountValue)

        startActivity(randomIntent)
    }
}