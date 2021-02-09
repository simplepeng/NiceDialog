package me.simple.nicedialog

import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

open class NiceDialogFragment : DialogFragment(), INiceDialog {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.NiceDialog)
    }

    override fun onStart() {
        initWindowSetting(dialog?.window)
        super.onStart()
    }

    /**
     *
     */
    open fun show(manager: FragmentManager) {
        super.show(manager, null)
    }

    /**
     *
     */
    open fun show(transaction: FragmentTransaction) {
        super.show(transaction, null)
    }

    /**
     *
     */
    open fun showNow(manager: FragmentManager) {
        super.showNow(manager, null)
    }
}