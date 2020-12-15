package ca.tk.unittestdemo

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num1 = findViewById<View>(R.id.num1)
        val num2 = findViewById<View>(R.id.num2)
        val button: Button = findViewById<View>(R.id.calcBtn) as Button

        lateinit var validator: Validator

        button.setOnClickListener {
            validator.isValidNumber(num1.toString())
            validator.isValidNumber(num2.toString())

        }

    }
}