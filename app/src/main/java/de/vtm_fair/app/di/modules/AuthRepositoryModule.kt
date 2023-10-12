package de.vtm_fair.app.di.modules

import dagger.Module
import dagger.Provides
import de.vtm_fair.app.data.repository.AuthDataSource
import de.vtm_fair.app.data.repository.AuthRemoteDataSource
import de.vtm_fair.app.di.qualifiers.Remote
import de.vtm_fair.app.network.ServerApi
import javax.inject.Singleton

@Module
class AuthRepositoryModule {

    @Singleton
    @Provides
    @Remote
    fun provideAuthRemoteDataSource(serverApi: ServerApi): AuthDataSource =
        AuthRemoteDataSource(serverApi)
}