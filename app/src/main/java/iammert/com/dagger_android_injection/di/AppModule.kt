package iammert.com.dagger_android_injection.di

import android.app.Application
import android.content.Context

import dagger.Binds
import dagger.Module

/**
 * Created by mertsimsek on 25/05/2017.
 */
@Module
abstract class AppModule {

    @Binds
    internal abstract fun provideContext(application: Application): Context

}
