package com.mobven.core

import android.app.Activity

interface DefaultActivityFactory {
    fun instantiate(): Activity
}