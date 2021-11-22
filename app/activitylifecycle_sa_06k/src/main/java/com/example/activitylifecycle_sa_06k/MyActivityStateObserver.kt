package com.example.activitylifecycle_sa_06k

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

class MyActivityStateObserver: LifecycleObserver{
    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun getLifeCycleState(source: LifecycleOwner, event: Lifecycle.Event){
        Log.d(MainActivity.MY_LOG_VIA_OBSERVER, event.toString())

    }

}