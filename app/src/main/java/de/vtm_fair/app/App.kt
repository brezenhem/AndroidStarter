package de.vtm_fair.app

import dagger.android.DaggerApplication
import de.vtm_fair.app.di.DaggerAppComponent
import timber.log.Timber

class App : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

    override fun applicationInjector() = DaggerAppComponent.builder()
        .application(this)
        .build()
}