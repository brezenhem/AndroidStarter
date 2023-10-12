package de.vtm_fair.app.ui

interface BasePresenter<V : BaseView> {
    fun takeView(view: V)
    fun dropView()
}