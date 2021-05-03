package com.rogerio.caixadetexto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage (view: View) {
        val EditText = findViewById<EditText>(R.id.editTextTextPersonName)
        val message = EditText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putEXTRA(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    private fun putEXTRA(extraMessage: String, message: String) {

    }
}
