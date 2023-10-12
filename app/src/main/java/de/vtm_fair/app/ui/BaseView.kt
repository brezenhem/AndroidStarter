package de.vtm_fair.app.ui

import android.view.View
import androidx.annotation.StringRes

interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun showError(error: Throwable, onClick: () -> Unit)
    fun showError(@StringRes messageResId: Int, onClick: () -> Unit)
}