package demo.simple.nicedialog.dialog_fragment_impl

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import demo.simple.nicedialog.R
import me.simple.nicedialog.NiceBottomDialogFragment

class BottomDialogFragmentImpl : NiceBottomDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dialog_nice_impl, container, false)
    }
}