package demo.simple.nicedialog

import android.content.Context
import android.os.Bundle
import me.simple.nicedialog.NiceBottomDialog

class EditBottomDialogImpl(context: Context) : NiceBottomDialog(context) {

    override fun setLayoutRes(): Int {
        return R.layout.dialog_edit
    }


    override fun onCreateAfter(savedInstanceState: Bundle?) {
    }

}