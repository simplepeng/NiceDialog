package me.simple.nicedialog

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

open class NiceDialogFragment : DialogFragment(), INiceDialog {

    override fun onStart() {
        initWindowSetting(dialog?.window)
        super.onStart()
    }

    /**
     *
     */
    fun show(manager: FragmentManager) {
        super.show(manager, null)
    }

    /**
     *
     */
    fun show(transaction: FragmentTransaction) {
        super.show(transaction, null)
    }

    /**
     *
     */
    fun showNow(manager: FragmentManager) {
        super.showNow(manager, null)
    }
}