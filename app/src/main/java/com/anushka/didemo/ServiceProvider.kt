package com.anushka.didemo

import android.util.Log
import javax.inject.Inject

/**
 * Dependency consumer is a class where we need to instantiate the objects.
 * Dagger will provide the dependency,
 * and for this, we just need to annotate the object declaration with @Inject.
 * **/

class ServiceProvider @Inject constructor() {

    init {
        Log.i("MYTAG","Service Provider Constructed")
    }



    fun getServiceProvider(){
        Log.i("MYTAG","Service provider connected")
    }
}