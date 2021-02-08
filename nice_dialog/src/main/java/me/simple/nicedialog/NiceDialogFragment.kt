package me.simple.nicedialog

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

abstract class NiceDialogFragment : DialogFragment() {

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