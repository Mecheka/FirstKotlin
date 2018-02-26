package com.example.suriya.firstkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initInstance()

    }

    private fun initInstance() {

        val editFirst = findViewById<EditText>(R.id.editFirst)
        val btnSave = findViewById<Button>(R.id.btnSave)

        btnSave.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                val value = editFirst.text

                Toast.makeText(this@MainActivity, "Your Name : " + value, Toast.LENGTH_SHORT).show()

            }
        })

    }
}
