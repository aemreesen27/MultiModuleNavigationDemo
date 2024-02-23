package com.mobven.core

import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Qualifier

@EntryPoint
@InstallIn(ActivityComponent::class)
interface ActivityFactory {

    @ActivityFactoryKeys.ActivityA
    fun getActivityA(): DefaultActivityFactory

    @ActivityFactoryKeys.ActivityB
    fun getActivityB(): DefaultActivityFactory

    @ActivityFactoryKeys.MainActivity
    fun getMainActivity(): DefaultActivityFactory

}


abstract class ActivityFactoryKeys {

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class ActivityA

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class ActivityB

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class MainActivity

}
