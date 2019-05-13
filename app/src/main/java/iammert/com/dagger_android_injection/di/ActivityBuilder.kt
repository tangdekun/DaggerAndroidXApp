package iammert.com.dagger_android_injection.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import iammert.com.dagger_android_injection.ui.detail.DetailActivity
import iammert.com.dagger_android_injection.ui.detail.DetailActivityProvideModule
import iammert.com.dagger_android_injection.ui.detail.DetailFragmentProvider
import iammert.com.dagger_android_injection.ui.main.MainActivity
import iammert.com.dagger_android_injection.ui.main.MainActivityProvideModule

/**
 * Created by mertsimsek on 25/05/2017.
 */
@Module
abstract class ActivityBuilder {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityProvideModule::class])
    internal abstract fun bindMainActivity(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [DetailActivityProvideModule::class, DetailFragmentProvider::class])
    internal abstract fun bindDetailActivity(): DetailActivity

}
