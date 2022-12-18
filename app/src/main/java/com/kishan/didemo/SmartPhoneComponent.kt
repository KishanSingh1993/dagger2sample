package com.kishan.didemo

import dagger.Component


/**
 * The connection between our dependency provider and dependency consumer is
 * provided via an interface by annotating it with @Component.
 * And the rest of the thing will be done by Dagger.
 * **/


@Component(modules = [MemoryCardModule::class,NCBatteryModule::class])
interface SmartPhoneComponent {

    fun getSmartPhone() : SmartPhone
}