package de.vtm_fair.app.data.repository

import de.vtm_fair.app.data.model.AuthResponse
import io.reactivex.Single

interface AuthDataSource {
    fun getAccessToken(username: String, password: String): Single<AuthResponse>
}