package com.baculsoft.kotlinandroid

import android.app.Application
import android.content.Context
import android.support.multidex.MultiDex

/**
 * @author Budi Oktaviyan Suryanto (budi@baculsoft.com)
 */
class App : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}