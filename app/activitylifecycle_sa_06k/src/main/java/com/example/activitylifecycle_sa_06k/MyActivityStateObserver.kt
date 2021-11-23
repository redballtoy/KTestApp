package com.example.activitylifecycle_sa_06k

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner

class MyActivityStateObserver : DefaultLifecycleObserver {
    fun getLifeCycleState(source: LifecycleOwner, event: Lifecycle.Event) {
        Log.d(MainActivity.MY_LOG_VIA_OBSERVER, event.toString())
    }
}