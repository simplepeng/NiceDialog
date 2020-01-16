package demo.simple.nicedialog

import android.content.Context
import android.os.Bundle
import me.simple.nicedialog.NiceDialog

class NiceDialogImpl(context: Context) : NiceDialog(context) {

    override fun setLayoutRes(): Int {
        return R.layout.dialog_nice_impl
    }

    override fun onCreateAfter(savedInstanceState: Bundle?) {
    }
}