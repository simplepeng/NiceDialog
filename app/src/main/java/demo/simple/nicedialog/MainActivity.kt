package demo.simple.nicedialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import demo.simple.nicedialog.dialog_fragment_impl.NiceDialogFragmentImpl
import demo.simple.nicedialog.dialog_impl.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)

        btn_niceDialog.setOnClickListener {
            showNiceDialog()
        }

        btn_bottomDialog.setOnClickListener {
            BottomDialogImpl(this).show()
        }

        btn_editDialog.setOnClickListener {
            val dialogImpl = EditNiceDialogImpl(this)
//            dialogImpl.setOnShowListener{
//
//            }
            dialogImpl.show()
        }

        btn_bottomEditDialog.setOnClickListener {
            EditBottomDialogImpl(this).show()
        }

        btn_fullDialog.setOnClickListener {
            FullDialogImpl(this).show()
        }
    }

    private fun showNiceDialog() {
        NiceDialogImpl(this).show()
    }

    fun niceDialogFragmentClick(view: View) {
        val dialogFragment = NiceDialogFragmentImpl()
        dialogFragment.show(supportFragmentManager)
    }
}
