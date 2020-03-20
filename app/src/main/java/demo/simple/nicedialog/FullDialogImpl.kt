package demo.simple.nicedialog

import android.content.Context
import android.os.Bundle
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