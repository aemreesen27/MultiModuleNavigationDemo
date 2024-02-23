package com.mobven.featurea

import android.app.Activity
import com.mobven.core.DefaultActivityFactory
import javax.inject.Inject

class ActivityAFactoryImpl @Inject constructor() : DefaultActivityFactory {
    override fun instantiate(): Activity = ActivityA()
}