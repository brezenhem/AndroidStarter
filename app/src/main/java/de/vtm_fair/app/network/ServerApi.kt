package de.vtm_fair.app.network

import de.vtm_fair.app.data.model.AuthResponse
import io.reactivex.Single

import retrofit2.http.POST
import retrofit2.http.Query

interface ServerApi {
    @POST("/api/auth")
    fun getAccessToken(
        @Query("username") username: String,
        @Query("password") password: String
    ): Single<AuthResponse>
}