package com.kishan.didemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var smartPhone: SmartPhone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        (application as SmartPhoneApplication).smartPhoneComponent
            .inject(this)

        smartPhone.makeACallWithRecording()



//        DaggerSmartPhoneComponent.builder()
//            .memoryCardModule(MemoryCardModule(1000))
//            .build()
//            .inject(this)


//      DaggerSmartPhoneComponent.create()
//          .inject(this)
//
//        smartPhone.makeACallWithRecording()















//        val battery = Battery()
//        val memoryCard = MemoryCard()
//        val serviceProvider = ServiceProvider()
//        val simCard = SIMCard(serviceProvider)

        //Construct DI
        //val smartPhone = SmartPhone(battery,simCard, memoryCard)
        //smartPhone.makeACallWithRecording()
//        val smartPhone = SmartPhone(
//            Battery(),
//            SIMCard(ServiceProvider()),
//            MemoryCard()).makeACallWithRecording()



    }
}
