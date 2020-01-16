package demo.simple.nicedialog

import android.content.Context
import android.os.Bundle
import me.simple.nicedialog.NiceBottomDialog

class BottomDialogImpl(context: Context) : NiceBottomDialog(context) {

    override fun setLayoutRes(): Int {
        return R.layout.dialog_nice_impl
    }


    override fun onCreateAfter(savedInstanceState: Bundle?) {
    }

}