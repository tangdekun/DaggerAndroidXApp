package iammert.com.dagger_android_injection.ui.detail.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import javax.inject.Inject

/**
 * Created by mertsimsek on 02/06/2017.
 */

class DetailFragment : DaggerFragment(), DetailFragmentView {

    var detailFragmentPresenter: DetailFragmentPresenter? = null
        @Inject set

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onDetailFragmentLoaded() {
        Log.v("TEST", "OnDetailFragmentLoaded.")
    }

    companion object {

        fun newInstance(): DetailFragment {
            val args = Bundle()
            val fragment = DetailFragment()
            fragment.arguments = args
            return fragment
        }
    }
}
