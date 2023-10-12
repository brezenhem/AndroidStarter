package de.vtm_fair.app.ui.main

import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import de.vtm_fair.app.di.scopes.ActivityScoped
import de.vtm_fair.app.di.scopes.FragmentScoped
import de.vtm_fair.app.ui.authentication.AuthenticationContract
import de.vtm_fair.app.ui.authentication.AuthenticationFragment
import de.vtm_fair.app.ui.authentication.AuthenticationPresenter
import de.vtm_fair.app.ui.dashboard.DashboardContract
import de.vtm_fair.app.ui.dashboard.DashboardFragment
import de.vtm_fair.app.ui.dashboard.DashboardPresenter

@Module
abstract class MainModule {
    @FragmentScoped
    @ContributesAndroidInjector
    internal abstract fun dashboardFragment(): DashboardFragment

    @ActivityScoped
    @Binds
    abstract fun dashboardPresenter(presenter: DashboardPresenter): DashboardContract.Presenter

    @FragmentScoped
    @ContributesAndroidInjector
    internal abstract fun authenticationFragment(): AuthenticationFragment

    @ActivityScoped
    @Binds
    abstract fun authenticationPresenter(presenter: AuthenticationPresenter): AuthenticationContract.Presenter

    @ActivityScoped
    @Binds
    abstract fun mainPresenter(presenter: MainPresenter): MainContract.Presenter
}