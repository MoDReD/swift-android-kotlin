package com.example.user.myapplication

import android.app.Application

class SwiftApp : Application() {

    override fun onCreate() {
        super.onCreate()
        sharedApplication = this
    }

    companion object {

        lateinit var sharedApplication: Application
            private set
    }
}
