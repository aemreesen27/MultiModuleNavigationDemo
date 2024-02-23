package com.mobven.featureb

import android.app.Activity
import com.mobven.core.DefaultActivityFactory
import javax.inject.Inject

class ActivityBFactoryImpl @Inject constructor() : DefaultActivityFactory {
    override fun instantiate(): Activity = ActivityB()
}