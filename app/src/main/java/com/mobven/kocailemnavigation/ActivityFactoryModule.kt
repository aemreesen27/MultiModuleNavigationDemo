package com.mobven.kocailemnavigation

import com.mobven.core.ActivityFactoryKeys
import com.mobven.core.DefaultActivityFactory
import com.mobven.featurea.ActivityAFactoryImpl
import com.mobven.featureb.ActivityBFactoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent


@Module
@InstallIn(ActivityComponent::class)
object ActivityFactoryModule {

    @ActivityFactoryKeys.ActivityA
    @Provides
    fun provideActivityAFactory(): DefaultActivityFactory {
        return ActivityAFactoryImpl()
    }

    @ActivityFactoryKeys.ActivityB
    @Provides
    fun provideActivityBFactory(): DefaultActivityFactory {
        return ActivityBFactoryImpl()
    }

    @ActivityFactoryKeys.MainActivity
    @Provides
    fun provideActivityMainFactory(): DefaultActivityFactory {
        return ActivityBFactoryImpl()
    }

}
