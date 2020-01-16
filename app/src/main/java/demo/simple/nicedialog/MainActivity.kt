package demo.simple.nicedialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
    }

    private fun showNiceDialog() {
        NiceDialogImpl(this).show()
    }
}
