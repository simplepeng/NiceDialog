package demo.simple.nicedialog.dialog_impl

import android.content.Context
import android.os.Bundle
import demo.simple.nicedialog.R
import me.simple.nicedialog.NiceFullScreenDialog

class FullDialogImpl(context: Context) : NiceFullScreenDialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_full)
    }

    override fun isHideBar(): Boolean {
        return true
    }
}