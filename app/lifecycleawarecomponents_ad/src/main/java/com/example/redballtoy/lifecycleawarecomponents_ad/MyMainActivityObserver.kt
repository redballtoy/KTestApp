package com.example.redballtoy.lifecycleawarecomponents_ad

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MyLogShowObserver : DefaultLifecycleObserver {
    override fun onCreate(owner: LifecycleOwner) {
        Log.d("myLogObserver", "MyLogShowObserver: onCreate()")
    }

    override fun onStart(owner: LifecycleOwner) {
        Log.d("myLogObserver", "MyLogShowObserver: onStart()")
    }

    override fun onResume(owner: LifecycleOwner) {
        Log.d("myLogObserver", "MyLogShowObserver: onResume()")
    }

    override fun onPause(owner: LifecycleOwner) {
        Log.d("myLogObserver", "MyLogShowObserver: onPause()")
    }

    override fun onStop(owner: LifecycleOwner) {
        Log.d("myLogObserver", "MyLogShowObserver: onStop()")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        Log.d("myLogObserver", "MyLogShowObserver: onDestroy()")
    }
}
