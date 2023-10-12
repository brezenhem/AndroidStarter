package de.vtm_fair.app.ui.second

import de.vtm_fair.app.ui.BasePresenter
import de.vtm_fair.app.ui.BaseView

interface SecondContract {

    interface View : BaseView {
    }

    interface Presenter : BasePresenter<View> {
    }
}