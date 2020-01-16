package me.simple.nicedialog

import android.content.Context
import android.view.Gravity
import android.view.WindowManager

abstract class NiceBottomDialog(context: Context) : NiceDialog(context) {

    override fun setWidth() = WindowManager.LayoutParams.MATCH_PARENT

    override fun setGravity() = Gravity.BOTTOM

    override fun setAnimRes() = R.style.NiceBottomDialogAnim
}