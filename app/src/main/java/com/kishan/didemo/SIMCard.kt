package com.kishan.didemo

import android.util.Log
import javax.inject.Inject


//private  val serviceProvider: ServiceProvider
class SIMCard @Inject constructor(private  val serviceProvider: ServiceProvider) {


    //private lateinit var serviceProvider: ServiceProvider

    init {
        Log.i("MYTAG","SIM Card Constructed")
    }

//    fun setServiceProvider(serviceProvider: ServiceProvider){
//        this.serviceProvider = serviceProvider
//    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}