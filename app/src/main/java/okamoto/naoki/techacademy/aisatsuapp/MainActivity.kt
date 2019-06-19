package okamoto.naoki.techacademy.aisatsuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.TimePickerDialog
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener{
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        var h: Int = 0

        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                h = hour
                textView.text = h.toString()

                if(h >=2 && h < 10){
                    textView.text = "おはよう"
                }else if(h >= 10 && h < 18){
                    textView.text = "こんにちは"
                }else{
                    textView.text = "こんばんは"
                }

            },
            0, 0, true)

        timePickerDialog.show()

    }



}
