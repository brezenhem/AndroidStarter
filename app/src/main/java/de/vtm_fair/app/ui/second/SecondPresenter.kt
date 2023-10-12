package de.vtm_fair.app.ui.second

import de.vtm_fair.app.di.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class SecondPresenter @Inject constructor() : SecondContract.Presenter {
    private var view: SecondContract.View? = null

    override fun takeView(view: SecondContract.View) {
        this.view = view
    }

    override fun dropView() {
        view = null
    }
}