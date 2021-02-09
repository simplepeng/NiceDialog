package demo.simple.nicedialog.dialog_fragment_impl

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.*
import demo.simple.nicedialog.R
import me.simple.nicedialog.NiceBottomDialogFragment

class BottomDialogFragmentImpl : NiceBottomDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val parent = dialog?.window?.findViewById(android.R.id.content) as ViewGroup
        val view = inflater.inflate(R.layout.dialog_nice_impl, parent, false)

        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog?.window?.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )
        val params = dialog?.window?.attributes?.apply {
//            width = WindowManager.LayoutParams.MATCH_PARENT
//            height = WindowManager.LayoutParams.WRAP_CONTENT
            windowAnimations = R.style.NiceBottomDialogAnim
        }
        dialog?.window?.attributes = params

        return view
    }
}