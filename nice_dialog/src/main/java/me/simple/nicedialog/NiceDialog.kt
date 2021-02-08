package me.simple.nicedialog

import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.view.Gravity
import android.view.Window
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager

abstract class NiceDialog : Dialog {

    constructor(context: Context) : super(context, R.style.NiceDialog)
    constructor(context: Context, themeResId: Int) : super(context, themeResId)

    override fun onStart() {
        super.onStart()
        val w = window ?: return

        w.setWindowAnimations(setAnimRes())
        if (autoShowSoftInput()) {
            w.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE)
        }

        val params = w.attributes

        params.width = setWidth()
        params.height = setHeight()
        params.dimAmount = setDimAmount()
        params.gravity = setGravity()

        w.attributes = params
    }

    protected open fun setWidth() = WindowManager.LayoutParams.WRAP_CONTENT

    protected open fun setHeight() = WindowManager.LayoutParams.WRAP_CONTENT

    protected open fun setDimAmount() = 0.5f

    protected open fun setGravity() = Gravity.CENTER

    protected open fun setAnimRes(): Int = 0

    protected open fun autoShowSoftInput() = false
}