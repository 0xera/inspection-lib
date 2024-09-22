package com.zeroxera.inspection.app

import android.app.Application
import com.facebook.flipper.BuildConfig
import com.facebook.flipper.android.AndroidFlipperClient
import com.facebook.flipper.android.utils.FlipperUtils
import com.facebook.flipper.plugins.jetpackcompose.UIDebuggerComposeSupport
import com.facebook.flipper.plugins.uidebugger.UIDebuggerFlipperPlugin
import com.facebook.flipper.plugins.uidebugger.core.UIDContext
import com.facebook.soloader.SoLoader

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        SoLoader.init(this, false)

        val client = AndroidFlipperClient.getInstance(this)
        val context = UIDContext.create(this)
        client.addPlugin(UIDebuggerFlipperPlugin(context))
        UIDebuggerComposeSupport.enable(context)
        client.start()
    }
}