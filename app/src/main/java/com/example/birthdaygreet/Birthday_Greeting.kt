package com.example.birthdaygreet

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Birthday_Greeting : AppCompatActivity() {
    companion object{
        val Nil="k"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
       val ni=findViewById<TextView>(R.id.Eilsh_ranjan)
        val name=intent.getStringExtra(Nil)
        ni.text="happy birthday $name"


    }



}