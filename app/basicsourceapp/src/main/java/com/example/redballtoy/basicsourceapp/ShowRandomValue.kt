package com.example.redballtoy.basicsourceapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class ShowRandomValue : AppCompatActivity() {

    private lateinit var showRandomValue: TextView
    private lateinit var labelRandomValue: TextView

    companion object {
        const val TOTAL_COUNT = "total_count"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_random_value)

        showRandomValue = findViewById<TextView>(R.id.tv_act_show_random_value_show_random_count)
        labelRandomValue = findViewById<TextView>(R.id.tv_act_show_random_label)

        val countValue = intent.getIntExtra(TOTAL_COUNT, 0)
        var randomValue = Random.nextInt(countValue+1)

        showRandomValue.text = randomValue.toString()
        var textLabel = labelRandomValue.text.toString()
        labelRandomValue.text = "$textLabel ${countValue.toShort()}"

    }
}