package de.vtm_fair.app.di.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import de.vtm_fair.app.App
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideContext(application: App): Context {
        return application.applicationContext
    }
}