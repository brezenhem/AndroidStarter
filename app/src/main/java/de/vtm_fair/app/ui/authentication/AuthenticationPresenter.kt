package de.vtm_fair.app.ui.authentication

import android.annotation.SuppressLint
import de.vtm_fair.app.data.repository.AuthRepository
import de.vtm_fair.app.di.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
@SuppressLint("CheckResult")
class AuthenticationPresenter @Inject constructor(
    var authRepository: AuthRepository
) : AuthenticationContract.Presenter {

    private var view: AuthenticationContract.View? = null

    override fun takeView(view: AuthenticationContract.View) {
        this.view = view
    }

    init {
        getAccessToken()
    }

    private fun getAccessToken() {
        authRepository.getAccessToken("vova@gmail.com", "qwerty")
            .subscribe({
                view?.showUserLoggdInDialog()
            }, {
                // TODO handle errors
            })
    }

    override fun dropView() {
        view = null
    }
}