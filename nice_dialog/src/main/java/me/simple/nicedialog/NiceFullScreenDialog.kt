package me.simple.nicedialog

import android.content.Context
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.ViewGroup
import android.view.WindowManager

abstract class NiceFullScreenDialog(context: Context) : NiceDialog(context) {

    override fun setWidth(): Int {
        return WindowManager.LayoutParams.MATCH_PARENT
    }

    override fun setHeight(): Int {
        return WindowManager.LayoutParams.MATCH_PARENT
    }

    override fun show() {
        hideBar()
        super.show()
    }

    protected open fun isHideBar(): Boolean = true

    private fun hideBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP && isHideBar()) {
            window?.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window?.statusBarColor = Color.TRANSPARENT
        }
    }
}