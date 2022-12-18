package com.kishan.didemo

import dagger.Component
import javax.inject.Singleton


/**
 * The connection between our dependency provider and dependency consumer is
 * provided via an interface by annotating it with @Component.
 * And the rest of the thing will be done by Dagger.
 * **/

@Singleton
@Component(modules = [MemoryCardModule::class,NCBatteryModule::class])
interface SmartPhoneComponent {

    //fun getSmartPhone() : SmartPhone

    fun inject(mainActivity: MainActivity)
}