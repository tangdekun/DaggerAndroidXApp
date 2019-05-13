package iammert.com.dagger_android_injection.ui.main

import dagger.Binds
import dagger.Module
import dagger.Provides
import iammert.com.dagger_android_injection.data.ApiService
import iammert.com.dagger_android_injection.di.ActivityScope

/**
 * Created by mertsimsek on 25/05/2017.
 */
@Module
abstract class MainActivityModule {

    @Binds
    internal abstract fun provideMainView(mainActivity: MainActivity): MainView


}

@Module(includes = [MainActivityModule::class])
class MainActivityProvideModule {
    @Provides
    @ActivityScope
    fun provideMainPresenter(detailView: MainView, apiService: ApiService): MainPresenter {
        return MainPresenterImpl(detailView, apiService)
    }
}
