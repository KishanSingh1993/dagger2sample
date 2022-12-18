package com.anushka.didemo

import dagger.Module
import dagger.Provides


/**
 * Dependencies are the objects that we need to instantiate inside a class.
 * We cannot instantiate a class inside a class.
 * The person who will provide us the objects that are called dependencies is
 * called Dependency Provider.
 * dagger2 is the class that you want to make a Dependency Provider,
 * It needs to annotate it with the @Module annotation.
 * **/


@Module
class MemoryCardModule {

    @Provides
    fun providesMemoryCard(): MemoryCard{

        return MemoryCard()
    }
}