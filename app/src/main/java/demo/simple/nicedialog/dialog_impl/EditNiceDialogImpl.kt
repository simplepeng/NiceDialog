package demo.simple.nicedialog.dialog_impl

import android.content.Context
import android.os.Bundle
import android.view.WindowManager
import demo.simple.nicedialog.R
import me.simple.nicedialog.NiceDialog

class EditNiceDialogImpl(context: Context) : NiceDialog(context) {

    override fun setLayoutRes(): Int {
        return R.layout.dialog_edit
    }

    override fun onCreateAfter(savedInstanceState: Bundle?) {
    }

    override fun setWidth(): Int {
        return WindowManager.LayoutParams.MATCH_PARENT
    }

    override fun autoShowSoftInput(): Boolean {
        return true
    }
}