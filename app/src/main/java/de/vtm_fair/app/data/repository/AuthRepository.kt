package de.vtm_fair.app.data.repository

import de.vtm_fair.app.data.model.AuthResponse
import de.vtm_fair.app.di.qualifiers.Remote
import de.vtm_fair.app.network.ServerApi
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthRepository @Inject constructor(@Remote private val remote: AuthDataSource) {

    fun getAccessToken(username: String, password: String): Single<AuthResponse> {
        return remote.getAccessToken(username, password)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }
}