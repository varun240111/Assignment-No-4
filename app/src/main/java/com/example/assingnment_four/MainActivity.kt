package com.example.assingnment_four
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var myTextView: TextView
    private var counter = 0 // Counter for Button 1 clicks

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        myTextView = findViewById(R.id.myTextView)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)

        // Button 1 - Change text (increment counter or display a message)
        button1.setOnClickListener {
            counter++
            myTextView.text = "Counter: $counter"
        }

        // Button 2 - Change height of TextView
        button2.setOnClickListener {
            val newHeight = if (myTextView.height < 200) 200 else 100
            myTextView.layoutParams.height = newHeight
            myTextView.requestLayout()
        }

        // Button 3 - Center the TextView
        button3.setOnClickListener {
            myTextView.gravity = Gravity.CENTER
        }
    }
}
