package demo.simple.nicedialog.dialog_impl

import android.content.Context
import android.os.Bundle
import demo.simple.nicedialog.R
import me.simple.nicedialog.NiceFullScreenDialog

class FullDialogImpl(context: Context) : NiceFullScreenDialog(context) {

    override fun setLayoutRes(): Int {
        return R.layout.dialog_full
    }

    override fun onCreateAfter(savedInstanceState: Bundle?) {
    }

    override fun isHideBar(): Boolean {
        return true
    }
}