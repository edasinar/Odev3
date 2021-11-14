package com.edasinar.odev3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView : TextView = findViewById(R.id.textView)
        textView.isVisible = false
    }

    fun clickHere(view : View){
        var textView : TextView = findViewById(R.id.textView)
        textView.isVisible = true
        textView.setText("Hello World!! I am Kotlin :)")
    }
}