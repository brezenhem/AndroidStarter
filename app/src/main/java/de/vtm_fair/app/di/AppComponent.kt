package de.vtm_fair.app.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import de.vtm_fair.app.App
import de.vtm_fair.app.data.repository.AuthRepository
import de.vtm_fair.app.di.modules.ActivityBindingModule
import de.vtm_fair.app.di.modules.AppModule
import de.vtm_fair.app.di.modules.AuthRepositoryModule
import de.vtm_fair.app.network.NetworkModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AuthRepositoryModule::class,
        // Add other repository modules here
        AppModule::class,
        AndroidInjectionModule::class,
        ActivityBindingModule::class,
        NetworkModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {

    fun authRepository(): AuthRepository
    // Add other repositories here

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: App): Builder
        fun build(): AppComponent
    }

    override fun inject(app: App)
}