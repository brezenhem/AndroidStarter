package de.vtm_fair.app.ui

import androidx.annotation.StringRes
import com.google.android.material.snackbar.Snackbar
import dagger.android.support.DaggerAppCompatActivity
import de.vtm_fair.app.R

abstract class BaseActivity : DaggerAppCompatActivity(), BaseView {

    override fun showLoading() {}

    override fun hideLoading() {}

    override fun showError(error: Throwable, onClick: () -> Unit) {
        val snackBar = Snackbar.make(
            findViewById(R.id.content),
            error.localizedMessage ?: "Error",
            Snackbar.LENGTH_LONG
        )
        snackBar.setAction(R.string.close) {
            snackBar.dismiss()
            onClick()
        }
        snackBar.show()
    }

    override fun showError(@StringRes messageResId: Int, onClick: () -> Unit) {
        val snackBar = Snackbar.make(findViewById(R.id.content), messageResId, Snackbar.LENGTH_LONG)
        snackBar.setAction(R.string.close) {
            snackBar.dismiss()
            onClick()
        }
        snackBar.show()
    }
}