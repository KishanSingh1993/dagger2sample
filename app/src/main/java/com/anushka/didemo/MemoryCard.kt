package com.anushka.didemo

import android.util.Log
import javax.inject.Inject

//@Inject constructor()

class MemoryCard {
    init {
        Log.i("MYTAG","Memory Card Constructed")
    }

    fun getSpaceAvailablity(){
        Log.i("MYTAG","Memory space available")
    }
}