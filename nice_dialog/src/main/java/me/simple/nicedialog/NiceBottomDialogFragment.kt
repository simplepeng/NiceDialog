package me.simple.nicedialog

import android.view.Gravity
import android.view.WindowManager

abstract class NiceBottomDialogFragment : NiceDialogFragment() {

    override fun setWidth() = WindowManager.LayoutParams.MATCH_PARENT

    override fun setGravity() = Gravity.BOTTOM

    override fun setAnimRes() = R.style.NiceBottomDialogAnim
}