package demo.simple.nicedialog.dialog_impl

import android.content.Context
import android.os.Bundle
import demo.simple.nicedialog.R
import me.simple.nicedialog.NiceBottomDialog

class EditBottomDialogImpl(context: Context) : NiceBottomDialog(context) {

    override fun setLayoutRes(): Int {
        return R.layout.dialog_edit
    }


    override fun onCreateAfter(savedInstanceState: Bundle?) {
    }

    override fun autoShowSoftInput(): Boolean {
        return true
    }
}