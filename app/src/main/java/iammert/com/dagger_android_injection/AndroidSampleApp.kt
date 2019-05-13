package iammert.com.dagger_android_injection

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import iammert.com.dagger_android_injection.di.DaggerAppComponent


/**
 * Created by mertsimsek on 25/05/2017.
 */

class AndroidSampleApp : DaggerApplication() {


    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val appComponent = DaggerAppComponent.builder().application(this).build()
        appComponent.inject(this)
        return appComponent
    }
}
