package me.simple.nicedialog

import android.content.Context
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.ViewGroup
import android.view.WindowManager

abstract class NiceFullScreenDialogFragment : NiceDialogFragment() {

    override fun setWidth() =  WindowManager.LayoutParams.MATCH_PARENT

    override fun setHeight() =  WindowManager.LayoutParams.MATCH_PARENT
    
    protected open fun isHideBar(): Boolean = true

    private fun hideBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP && isHideBar()) {
            dialog?.window?.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            dialog?.window?.statusBarColor = Color.TRANSPARENT
        }
    }
}