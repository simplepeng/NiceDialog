package me.simple.nicedialog

import android.view.Gravity
import android.view.Window
import android.view.WindowManager

interface INiceDialog {

    fun setWidth() = WindowManager.LayoutParams.WRAP_CONTENT

    fun setHeight() = WindowManager.LayoutParams.WRAP_CONTENT

    fun setDimAmount() = 0.5f

    fun setGravity() = Gravity.CENTER

    fun setAnimRes(): Int = 0

    fun autoShowSoftInput() = false

}