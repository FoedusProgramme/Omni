package uk.akane.omni

import android.app.Application

class Omni : Application() {
    override fun onCreate() {
        super.onCreate()
        // DynamicColors.applyToActivitiesIfAvailable(this)
    }
}