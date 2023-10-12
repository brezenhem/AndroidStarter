package de.vtm_fair.app.ui.dashboard

import android.content.Intent
import de.vtm_fair.app.di.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class DashboardPresenter @Inject constructor() : DashboardContract.Presenter {
    private var view: DashboardContract.View? = null

    override fun requestData() {
        view?.showReceivedData(Any())
    }

    override fun dataReceived(intent: Intent) {
        view?.showReceivedData(Any())
    }

    override fun takeView(view: DashboardContract.View) {
        this.view = view
    }

    override fun dropView() {
        this.view = null
    }
}