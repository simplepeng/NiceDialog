package demo.simple.nicedialog.dialog_impl

import android.content.Context
import android.os.Bundle
import demo.simple.nicedialog.R
import me.simple.nicedialog.NiceDialog

class NiceDialogImpl(context: Context) : NiceDialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_nice_impl)
    }
}