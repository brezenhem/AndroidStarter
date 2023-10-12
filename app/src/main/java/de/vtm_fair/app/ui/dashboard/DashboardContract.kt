package de.vtm_fair.app.ui.dashboard

import android.content.Intent
import de.vtm_fair.app.ui.BasePresenter
import de.vtm_fair.app.ui.BaseView

interface DashboardContract {

    interface View : BaseView {
        fun showReceivedData(data: Any)
        fun showAuthenticationScreen()
    }

    interface Presenter : BasePresenter<View> {
        fun requestData()
        fun dataReceived(intent: Intent)
    }
}