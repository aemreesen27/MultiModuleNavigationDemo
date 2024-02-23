package com.mobven.kocailemnavigation

import com.mobven.core.DefaultActivityFactory
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

}


abstract class ActivityFactoryKeys {

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class ActivityA

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class ActivityB
}
