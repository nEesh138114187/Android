package com.example.birthdaygreet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nil = findViewById<EditText>(R.id.NameInput)
        val button = findViewById<Button>(R.id.button1)

        button.setOnClickListener {
            addOne(nil)
        }


    }
    fun addOne(nil: EditText) {

        val n: String
        n = nil.text.toString()

        // Toast.makeText(this, "Happy Birthday $n", Toast.LENGTH_SHORT).show()
        intent= Intent(applicationContext,Birthday_Greeting::class.java)
        intent.putExtra(Birthday_Greeting.Nil,n)
        startActivity(intent)
    }
}