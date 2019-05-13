package iammert.com.dagger_android_injection.ui.detail

import dagger.Binds
import dagger.Module
import dagger.Provides
import iammert.com.dagger_android_injection.data.ApiService
import iammert.com.dagger_android_injection.di.ActivityScope

/**
 * Created by mertsimsek on 30/05/2017.
 */
@Module
abstract class DetailActivityModule {

    @Binds
    internal abstract fun provideDetailView(detailActivity: DetailActivity): DetailView

}

@Module(includes = [DetailActivityModule::class])
class DetailActivityProvideModule {
    @Provides
    @ActivityScope
    fun provideDetailPresenter(detailView: DetailView, apiService: ApiService): DetailPresenter {
        return DetailPresenterImpl(detailView, apiService)
    }
}