package iammert.com.dagger_android_injection.ui.detail

import javax.inject.Inject

import iammert.com.dagger_android_injection.data.ApiService

/**
 * Created by mertsimsek on 30/05/2017.
 */

class DetailPresenterImpl @Inject
constructor( var detailView: DetailView,  var apiService: ApiService) : DetailPresenter {

    override fun loadDetail() {
        apiService.loadData()
        detailView.onDetailLoaded()
    }
}
