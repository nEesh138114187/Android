package com.example.birthdaygreet

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Birthday_Greeting : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
       val ni=findViewById<TextView>(R.id.Eilsh_ranjan)
        val name=intent.getStringExtra(NAME_EXTRA)
        ni.text="happy birthday $name"


    }



}