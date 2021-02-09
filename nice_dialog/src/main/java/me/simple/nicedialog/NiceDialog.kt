package me.simple.nicedialog

import android.app.Dialog
import android.content.Context
import android.util.Log
import android.view.Window
import android.view.WindowManager

abstract class NiceDialog : Dialog, INiceDialog {

    constructor(context: Context) : super(context, R.style.NiceDialog)

    constructor(context: Context, themeResId: Int) : super(context, themeResId)

    override fun onStart() {
        initWindowSetting(window)
        super.onStart()
    }

}