package com.rogerio.caixadetexto

import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
    }
    val message = intent.getStringExtra(EXTRA_MESSAGE)
    val textView: TextView = findViewById<TextView>(R.id.editTextTextPersonName).apply { text = message
    }
}
