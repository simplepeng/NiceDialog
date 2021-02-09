package me.simple.nicedialog

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

abstract class NiceFullScreenDialogFragment : NiceDialogFragment() {

    override fun setWidth() = WindowManager.LayoutParams.MATCH_PARENT

    override fun setHeight() = WindowManager.LayoutParams.MATCH_PARENT

    protected open fun isHideBar(): Boolean = true

    override fun show(manager: FragmentManager) {
        hideBar()
        super.show(manager)
    }

    override fun show(transaction: FragmentTransaction) {
        hideBar()
        super.show(transaction)
    }

    override fun showNow(manager: FragmentManager) {
        hideBar()
        super.showNow(manager)
    }

    private fun hideBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP && isHideBar()) {
            dialog?.window?.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            dialog?.window?.statusBarColor = Color.TRANSPARENT
        }
    }
}