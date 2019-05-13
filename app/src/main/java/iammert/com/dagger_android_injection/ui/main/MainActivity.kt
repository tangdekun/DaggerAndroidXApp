package iammert.com.dagger_android_injection.ui.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import iammert.com.dagger_android_injection.R
import iammert.com.dagger_android_injection.ui.detail.DetailActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity(), MainView {

    var mainPresenter: MainPresenter? = null
        @Inject set

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainPresenter!!.loadMain()

        findViewById(R.id.button).setOnClickListener { startActivity(Intent(this@MainActivity, DetailActivity::class.java)) }
    }

    override fun onMainLoaded() {
        Log.v("TEST", "Main page is loaded.")
    }
}
