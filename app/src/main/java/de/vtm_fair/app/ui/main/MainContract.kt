package de.vtm_fair.app.ui.main

import de.vtm_fair.app.ui.BasePresenter
import de.vtm_fair.app.ui.BaseView

interface MainContract {

    interface View : BaseView {
    }

    interface Presenter : BasePresenter<View> {
    }
}