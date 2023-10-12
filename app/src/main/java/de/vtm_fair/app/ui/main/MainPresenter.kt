package de.vtm_fair.app.ui.main

import de.vtm_fair.app.di.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class MainPresenter @Inject constructor() : MainContract.Presenter {
    private var view: MainContract.View? = null

    override fun takeView(view: MainContract.View) {
        this.view = view
    }

    override fun dropView() {
        view = null
    }
}