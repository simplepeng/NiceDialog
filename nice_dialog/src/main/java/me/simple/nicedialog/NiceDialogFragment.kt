package me.simple.nicedialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

abstract class NiceDialogFragment : DialogFragment() {

    abstract fun setLayoutRes(): Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(setLayoutRes(), container, false)
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

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