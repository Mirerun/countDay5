package app.murauchi.mirerun.countapp_day5

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number = 0

        plusButton.setOnClickListener {
            number = number + 1
            textView.text = number.toString()
        }

        minusButton.setOnClickListener {
            number = number - 1
            textView.text = number.toString()
        }

        if (number % 3 == 0){
            textView.setTextColor(Color.GREEN)
        }
    }
}