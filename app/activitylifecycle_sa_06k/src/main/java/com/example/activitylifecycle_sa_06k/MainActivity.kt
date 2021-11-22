package com.example.activitylifecycle_sa_06k

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    companion object {
        const val MY_LOG="myLog"
        const val MY_LOG_VIA_OBSERVER="myLogViaObserver"
    }

    lateinit var myActivityStateObserver: MyActivityStateObserver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(MY_LOG,"onCreate()")

        myActivityStateObserver= MyActivityStateObserver()
        lifecycle.addObserver(myActivityStateObserver)
    }

    override fun onStart() {
        super.onStart()
        Log.d(MY_LOG,"onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MY_LOG,"onResumed()")
        onWindowFocusChanged(true)
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.d(MY_LOG,"onPostResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MY_LOG,"onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MY_LOG,"onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MY_LOG,"onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MY_LOG,"onDestroy()")
    }


}