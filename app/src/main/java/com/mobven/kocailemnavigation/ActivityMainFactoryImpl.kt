package com.mobven.kocailemnavigation

import android.app.Activity
import com.mobven.core.DefaultActivityFactory
import javax.inject.Inject

class ActivityMainFactoryImpl @Inject constructor() : DefaultActivityFactory {
    override fun instantiate(): Activity = MainActivity()
}