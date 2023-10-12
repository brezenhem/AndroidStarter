package de.vtm_fair.app.ui.authentication

import de.vtm_fair.app.ui.BasePresenter
import de.vtm_fair.app.ui.BaseView

interface AuthenticationContract {

    interface View : BaseView {
        fun showUserLoggdInDialog()
    }

    interface Presenter : BasePresenter<View> {
    }
}