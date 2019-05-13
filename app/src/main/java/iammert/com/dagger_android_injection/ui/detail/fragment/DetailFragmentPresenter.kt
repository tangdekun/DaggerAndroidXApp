package iammert.com.dagger_android_injection.ui.detail.fragment

import javax.inject.Inject

/**
 * Created by mertsimsek on 02/06/2017.
 */

class DetailFragmentPresenter @Inject
constructor(internal var detailFragmentView: DetailFragmentView) {

    init {
        detailFragmentView.onDetailFragmentLoaded()
    }
}
