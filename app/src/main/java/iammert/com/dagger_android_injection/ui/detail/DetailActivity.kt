package iammert.com.dagger_android_injection.ui.detail

import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import iammert.com.dagger_android_injection.R
import iammert.com.dagger_android_injection.ui.detail.fragment.DetailFragment
import javax.inject.Inject

/**
 * Created by mertsimsek on 25/05/2017.
 */

class DetailActivity : DaggerAppCompatActivity(), DetailView {


    var detailPresenter: DetailPresenter? = null
        @Inject set

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        detailPresenter!!.loadDetail()

        if (savedInstanceState == null)
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.container, DetailFragment.newInstance())
                    .commitAllowingStateLoss()
    }

    override fun onDetailLoaded() {
        Log.v("TEST", "Detail is loaded")
    }

}
