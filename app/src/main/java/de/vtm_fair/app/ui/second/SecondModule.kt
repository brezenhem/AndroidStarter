package de.vtm_fair.app.ui.second

import dagger.Binds
import dagger.Module
import de.vtm_fair.app.di.scopes.ActivityScoped

@Module
abstract class SecondModule {

    @ActivityScoped
    @Binds
    abstract fun secondPresenter(presenter: SecondPresenter): SecondContract.Presenter
}