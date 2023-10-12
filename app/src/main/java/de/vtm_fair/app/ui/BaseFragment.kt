package de.vtm_fair.app.ui

import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import dagger.android.support.DaggerFragment
import de.vtm_fair.app.R

abstract class BaseFragment : DaggerFragment(), BaseView {

    override fun showLoading() {
        activity?.findViewById<ConstraintLayout>(R.id.loadingLayout)?.visibility = View.VISIBLE
    }

    override fun hideLoading() {
        activity?.findViewById<ConstraintLayout>(R.id.loadingLayout)?.visibility = View.GONE
    }

}