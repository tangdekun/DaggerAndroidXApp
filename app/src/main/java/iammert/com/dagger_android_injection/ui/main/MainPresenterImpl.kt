package iammert.com.dagger_android_injection.ui.main

import iammert.com.dagger_android_injection.data.ApiService
import javax.inject.Inject

/**
 * Created by mertsimsek on 25/05/2017.
 */

class MainPresenterImpl @Inject
constructor(var mainView: MainView, var apiService: ApiService) : MainPresenter {

    override fun loadMain() {
        apiService.loadData()
        mainView.onMainLoaded()
    }
}
