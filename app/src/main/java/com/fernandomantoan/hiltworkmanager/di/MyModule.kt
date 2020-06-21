package com.fernandomantoan.hiltworkmanager.di

import com.fernandomantoan.hiltworkmanager.worker.WorkerDependency
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
class MyModule {
    @Singleton
    @Provides
    fun provideWorkerDependency(): WorkerDependency {
        return WorkerDependency()
    }
}