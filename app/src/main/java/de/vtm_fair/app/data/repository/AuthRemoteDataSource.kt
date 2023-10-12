package de.vtm_fair.app.data.repository

import de.vtm_fair.app.data.model.AuthResponse
import de.vtm_fair.app.network.ServerApi
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthRemoteDataSource @Inject constructor(private val serverApi: ServerApi) : AuthDataSource {

    override fun getAccessToken(username: String, password: String): Single<AuthResponse> {
        return serverApi.getAccessToken(username, password)
    }
}