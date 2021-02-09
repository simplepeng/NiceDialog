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
        super.onStart()

        val params = dialog?.window?.attributes?.apply {
            this.gravity = setGravity()
            this.width = setWidth()
            this.height = setHeight()
            this.windowAnimations = setAnimRes()
        }
        dialog?.window?.attributes = params
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