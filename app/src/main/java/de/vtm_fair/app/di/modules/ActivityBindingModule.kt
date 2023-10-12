package de.vtm_fair.app.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import de.vtm_fair.app.di.scopes.ActivityScoped
import de.vtm_fair.app.ui.main.MainActivity
import de.vtm_fair.app.ui.main.MainModule
import de.vtm_fair.app.ui.second.SecondActivity
import de.vtm_fair.app.ui.second.SecondModule

@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun mainActivity(): MainActivity

    @ActivityScoped
    @ContributesAndroidInjector(modules = [SecondModule::class])
    abstract fun secondActivity(): SecondActivity
}